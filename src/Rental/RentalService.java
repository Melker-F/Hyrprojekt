package Rental;

import Data.Inventory;
import Data.MemberRegistry;
import Item.Item;
import Member.Member;
import Policy.*;
import java.util.List;

import java.util.ArrayList;

public class RentalService {
    Inventory inventory;
    MemberRegistry memberreg;
    private double sum;
    private List<Rental> rentalList = new ArrayList<>();

    public double getSum() {
        return sum;
    }

    public RentalService(Inventory inventory, MemberRegistry memberreg) {
        this.inventory = inventory;
        this.memberreg = memberreg;
    }
        //Logiken för att kunna starta en uthyrning
    public boolean startRental(int memberId, int itemId, int days) {
        Item i = inventory.findById(itemId);
        if (i == null || !i.isAvailable())
            return false;
        Member m = memberreg.findById(memberId);
        if (m == null)
            return false;
        if (days < 1)
            return false;
        PricePolicy policy = getPricePolicyForMember(m);
        double cost = policy.calculatePrice(days, i);
        Rental rent = new Rental(m, i, cost, days);
        i.setAvailable(false);
        rentalList.add(rent);
        m.getRentalHistory().add(rent);
        return true;
    }
        //Logiken för att avsluta en uthyrning
    public boolean endRental(int itemId) {
        for (Rental r : rentalList) {
            if (r.getItem().getId() == itemId) {
                r.getItem().setAvailable(true);
                rentalList.remove(r);
                sum = sum + r.getCost();
                return true;
            }
        }
        return false;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

        //Kollar vilken policy som ska användas
    private PricePolicy getPricePolicyForMember(Member member) {
        String level = member.getLevel();
        if (level != null && level.equalsIgnoreCase("Premium")) {
            return new PremiumPolicy();
        } else {
            return new StandardPolicy();
        }
    }
}