package Policy;

import Item.Item;

public class StandardPolicy implements PricePolicy {

    @Override
    public double calculatePrice(int days, Item sak) {
        double cost;
        cost = sak.getPrice() * days;
        return cost;
    }
}
