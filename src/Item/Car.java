package Item;

public class Car extends Item {
    private String type;
    private int seats;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getSeats() { return seats; }

    public void setSeats(int seats) { this.seats = seats; }

    public Car (int id, int wheels, String model, boolean available, String name, String type, int seats) {
        super( id, wheels, model, available, name );
    }
}
