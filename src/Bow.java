/**
 * Uses InventoryArray to store Bow items.
 */
public class Bow extends InventoryItem {
    public InventoryItem createItem(String name, int damage, int inventorySpaces) {
        InventoryItem bow = new Bow();
        this.name = name;
        this.damage = damage;
        this.inventorySpaces = inventorySpaces;
        this.itemType = "Bow";

        return bow;
    }
}
