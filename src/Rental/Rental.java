package Rental;

import Item.Item;
import Member.Member;

public class Rental {
    private Member member;
    private Item item;
    private double cost;
    private int days;

    public Member getMember() { return member; }

    public Item getItem() { return item; }

    public double getCost() { return cost; }

    public int getDays() { return days; }

    public void setDays(int days) { this.days = days; }

    public Rental (Member member, Item item, double cost, int days) {
        this.member = member;
        this.item = item;
        this.cost = cost;
        this.days = days;
    }

    @Override
    public String toString() {
        return member.getName() + " hyrde " + getItem().getName() + " i " + getDays() + " dagar.";
    }
}