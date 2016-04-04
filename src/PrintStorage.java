import java.util.HashMap;

/**
 * Prints all of the items held in the player's inventory.
 */
public class PrintStorage {
    public static void printStorage() {
        HashMap<String, Integer> itemHashMap = HashStorage.getItemHashMap();
        for (String key : itemHashMap.keySet()){
            System.out.println("Number of " + key + "s: " + itemHashMap.get(key));
            System.out.println("Item number: " + ArrayStorage.itemList.indexOf(key));
        }
    }
}
