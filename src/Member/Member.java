package Member;

import java.util.ArrayList;
import java.util.List;

import Rental.Rental;

public class Member {
    private int id;
    private String name;
    private String level;
    private List<Rental> currentRentals = new ArrayList<>();


    public void setId(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getname() {
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

    public List<Rental> getCurrentRentals() {
        return currentRentals;
    }

    public void addToCurrentRentals(Rental rental) {
        this.currentRentals.add(rental);
    }
}