/**
 * Uses InventoryArray to store staff items in the inventory.
 */
public class Staff extends InventoryItem {
    public InventoryItem createItem(String name, int damage, int inventorySpaces) {
        InventoryItem staff = new Staff();
        this.name = name;
        this.damage = damage;
        this.inventorySpaces = inventorySpaces;
        this.itemType = "Staff";

        return staff;
    }
}
