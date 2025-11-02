package Data;

import java.util.HashMap;

import Item.Item;
import Item.Car;
import Item.Motorcycle;

public class Inventory {
    private HashMap<Integer, InventoryEntry> inventory = new HashMap<>();

    public Inventory() {
    }

    public void loadDatabase() {

        Item volvo      = new Car(0,4,"v70",true,"Volvo","kombi",4);
        Item audi       = new Car(1,4,"s8",true,"Audi","sedan",4);
        Item koenigsegg = new Car(2,4,"jesko",true,"Koenigsegg","supersport",2);
        Item toyota     = new Car(3,4,"gr yaris",true,"Toyota","hot hatch",4);
        Item honda      = new Car(4,4,"nsx",true,"Honda","sport",2);

        Item bmw        = new Motorcycle(5,2,"s1000rr",true,"BMW",true,4);
        Item harley     = new Motorcycle(6,3,"tri glide",true,"Harley",true,2);
        Item kawasaki   = new Motorcycle(7,2,"ninja h2r",true,"Kawasaki",false,4);
        Item aprilia    = new Motorcycle(8,2,"tuono v4x",true,"Aprilia",false,4);
        Item husqvarna  = new Motorcycle(9,2,"norden 901",true,"Husqvarna",true,2);

        inventory.put(volvo.getId(),     new InventoryEntry(volvo,4));
        inventory.put(audi.getId(),      new InventoryEntry(audi,3));
        inventory.put(koenigsegg.getId(),new InventoryEntry(koenigsegg,1));
        inventory.put(toyota.getId(),    new InventoryEntry(toyota,4));
        inventory.put(honda.getId(),     new InventoryEntry(honda,2));

        inventory.put(bmw.getId(),       new InventoryEntry(bmw,2));
        inventory.put(harley.getId(),    new InventoryEntry(harley,3));
        inventory.put(kawasaki.getId(),  new InventoryEntry(kawasaki, 2));
        inventory.put(aprilia.getId(),   new InventoryEntry(aprilia,3));
        inventory.put(husqvarna.getId(), new InventoryEntry(husqvarna,5));
    }
    public HashMap<Integer, InventoryEntry> getInventory() {
        return this.inventory;
    }

    @Override
    public String toString(){
        String text = "";
        for(InventoryEntry i:this.inventory.values()){
            text += i.toString();
        }
        return text;
    }
}
