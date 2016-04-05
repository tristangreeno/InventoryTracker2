/**
 * Potion is unique in that it heals damage, rather than deals it, like the other items.
 */

public class Potion extends InventoryItem {

    public InventoryItem createItem(String name, int healingValue, int inventorySpaces) {
        InventoryItem potion = new Potion();
        this.name = name;
        this.healingValue = healingValue;
        this.inventorySpaces = inventorySpaces;
        this.itemType = "Sword";

        return potion;
    }
}
