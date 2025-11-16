package Member;

import java.util.ArrayList;
import java.util.List;

import Rental.Rental;

public class Member {
    private int id;
    private String name;
    private String level;
    private List<Rental> rentalHistory = new ArrayList<>();


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public Member (){

    }

    public Member (int id, String name, String level){
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public List<Rental> getRentalHistory() {
        return rentalHistory;
    }

    public void addToCurrentRentals(Rental rental) {
        this.rentalHistory.add(rental);
    }

    @Override
    public String toString() {
        return getName();
    }
}