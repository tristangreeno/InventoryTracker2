/**
 * Holds the types of items the player can pick up.
 * Stores a name, number of inventory slots the item takes up, and
 */
public class InventoryItem {

    String name;
    int damage;
    int inventorySpaces;
    String itemType;
    int healingValue;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getInventorySpaces() {
        return inventorySpaces;
    }

    public String getItemType(){
        return itemType;
    }
}
