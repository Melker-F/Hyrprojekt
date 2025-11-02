package Item;

public abstract class Item {
    private int id;
    private int wheels;
    private String model;
    private boolean available;
    private String name;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getWheels() { return wheels; }

    public void setWheels(int wheels) { this.wheels = wheels; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public Item(int id, int wheels, String model, boolean available, String name){
        this.id = id;
        this.wheels = wheels;
        this.model = model;
        this.available = available;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
