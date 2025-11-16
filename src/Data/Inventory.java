package Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Item.*;

public class Inventory {
    private Map<Integer, Item> inventory = new HashMap<>();

    public Inventory() {
    }

    //Laddar in alla fordon som finns att hyras in i en HashMap
    public void loadDatabase() {

        Item car1   = new Car(0,4,"v70",true,"Volvo",500,"kombi",4);
        Item car2   = new Car(1,4,"v70",true,"Volvo",500,"kombi",4);
        Item car3   = new Car(2,4,"v70",true,"Volvo",500,"kombi",4);
        Item car4   = new Car(3,4,"s8",true,"Audi",600,"sedan",4);
        Item car5   = new Car(4,4,"s8",true,"Audi",600,"sedan",4);
        Item car6   = new Car(5,4,"jesko",true,"Koenigsegg",900,"supersport",2);
        Item car7   = new Car(6,4,"gr yaris",true,"Toyota",500,"hot hatch",4);
        Item car8   = new Car(7,4,"gr yaris",true,"Toyota",500,"hot hatch",4);
        Item car9   = new Car(8,4,"nsx",true,"Honda",700,"sport",2);
        Item car10   = new Car(9,4,"nsx",true,"Honda",700,"sport",2);

        Item bike1  = new Motorcycle(10,2,"s1000rr",true,"BMW",400,true,4);
        Item bike2  = new Motorcycle(11,2,"s1000rr",true,"BMW",400,true,4);
        Item bike3  = new Motorcycle(12,3,"tri glide",true,"Harley",450,true,2);
        Item bike4  = new Motorcycle(13,3,"tri glide",true,"Harley",450,true,2);
        Item bike5  = new Motorcycle(14,2,"ninja h2r",true,"Kawasaki",600,false,4);
        Item bike6  = new Motorcycle(15,2,"tuono v4x",true,"Aprilia",650,false,4);
        Item bike7  = new Motorcycle(16,2,"norden 901",true,"Husqvarna",300,true,2);
        Item bike8  = new Motorcycle(17,2,"norden 901",true,"Husqvarna",300,true,2);

        inventory.put(car1.getId(),  car1);
        inventory.put(car2.getId(),  car2);
        inventory.put(car3.getId(),  car3);
        inventory.put(car4.getId(),  car4);
        inventory.put(car5.getId(),  car5);
        inventory.put(car6.getId(),  car6);
        inventory.put(car7.getId(),  car7);
        inventory.put(car8.getId(),  car8);
        inventory.put(car9.getId(),  car9);
        inventory.put(car10.getId(), car10);

        inventory.put(bike1.getId(), bike1);
        inventory.put(bike2.getId(), bike2);
        inventory.put(bike3.getId(), bike3);
        inventory.put(bike4.getId(), bike4);
        inventory.put(bike5.getId(), bike5);
        inventory.put(bike6.getId(), bike6);
        inventory.put(bike7.getId(), bike7);
        inventory.put(bike8.getId(), bike8);
    }
    //Hur saker hämtas ur listan
    public Collection<Item> getAllItems() {
        return inventory.values();
    }
    //Hittar saker baserat på ID
    public Item findById(Integer id) {
        return inventory.get(id);
    }

    @Override
    public String toString(){
        String text = "";
        for(Item i:this.inventory.values()){
            text += i.toString();
        }
        return text;
    }
}