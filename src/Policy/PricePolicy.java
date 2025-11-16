package Policy;
import Item.Item;

public interface PricePolicy {
    public double calculatePrice(int days, Item sak);

}
