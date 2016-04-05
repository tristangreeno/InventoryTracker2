/**
 * Uses InventoryArray to store Sword items.
 */
public class Sword extends InventoryItem {

    public InventoryItem createItem(String name, int damage, int inventorySpaces) {
        InventoryItem sword = new Sword();
        this.name = name;
        this.damage = damage;
        this.inventorySpaces = inventorySpaces;
        this.itemType = "Sword";

        return sword;
    }
}
