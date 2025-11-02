package Policy;

public class PremiumPolicy implements PricePolicy {
    private static final double price = 600;
    private static final double discount = 0.85;

    @Override
    public double CalculatePrice(int days) {
        double cost;
        cost = (price * discount) * days;
        return cost;
    }
}
