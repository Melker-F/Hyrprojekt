package Policy;

public class StandardPolicy implements PricePolicy {
    private static final double price = 600;

    @Override
    public double CalculatePrice(int days) {
        double cost;
        cost = price * days;
        return cost;
    }
}
