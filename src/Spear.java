/**
 * Uses
 */
public class Spear extends InventoryItem {
    public InventoryItem createItem(String name, int damage, int inventorySpaces) {
        InventoryItem spear = new Spear();
        this.name = name;
        this.damage = damage;
        this.inventorySpaces = inventorySpaces;
        this.itemType = "Spear";

        return spear;
    }
}
