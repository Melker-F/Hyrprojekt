package Rental;

import Item.Item;
import Member.Member;

public class Rental {
    private Member member;
    private Item item;
    private double price;
    private int days;

    public Member getMember() { return member; }

    public Item getItem() { return item; }

    public double getPrice() { return price; }

    public int getDays() { return days; }

    public void setDays(int days) { this.days = days; }

    public Rental (Member member, Item item, double price, int days) {
        this.member = member;
        this.item = item;
        this.price = price;
        this.days = days;
    }
}