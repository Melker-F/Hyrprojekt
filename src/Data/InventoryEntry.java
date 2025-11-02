package Data;

import Item.Item;

public class InventoryEntry {

    private Item item;
    private int amount;

    public InventoryEntry() {
    }

    public InventoryEntry(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() { return item; }

    public void setItem(Item item) { this.item = item; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( this.item.toString());
        stringBuilder.append(" antal i lager: ").append(this.amount).append("\n");
        return stringBuilder.toString();
    }
}
