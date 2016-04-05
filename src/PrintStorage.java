import java.util.HashMap;

/**
 * Prints all of the items held in the player's inventory.
 * Prints the quantity of each item with its name.
 * Prints the index number of each item, which is based on order of entry.
 * Prints the category of the item (Bow, Sword, etc.).
 * Uses .getClass() to find the class of each item.
 */
public class PrintStorage {
    public static void printStorage() {
        HashMap<String, Integer> itemHashMap = InventoryHashmap.getItemQuantityInventory();
        for (String key : itemHashMap.keySet()){
            System.out.printf("Number of %ss: %d\n", key, itemHashMap.get(key));
            System.out.printf("InventoryItem index number: %d\n", InventoryArray.listOfItemNames.indexOf(key));
            System.out.printf("Category of Item: %s\n\n", InventorySystem.categoryOfItem.get(key).getClass());
        }
    }
}
