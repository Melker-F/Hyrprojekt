package Item;

public class Motorcycle extends Item{
    private boolean isStreetLegal;
    private int cylinders;

    public boolean isStreetLegal() { return isStreetLegal; }

    public void setStreetLegal(boolean streetLegal) { isStreetLegal = streetLegal; }

    public int getCylinders() { return cylinders; }

    public void setCylinders(int cylinders) { this.cylinders = cylinders; }

    public Motorcycle(int id, int wheels, String model, boolean available, String name, boolean isStreetLegal, int cylinders) {
        super(id, wheels, model, available, name);
    }
}
