package Policy;

import Item.Item;

public class PremiumPolicy implements PricePolicy {
    private static final double discount = 0.85;

    @Override
    public double calculatePrice(int days, Item sak) {
        double cost;
        cost = (sak.getPrice() * discount) * days;
        return cost;
    }
}
