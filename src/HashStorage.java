import java.util.HashMap;

/**
 * Stores the data concerning the number of each item in a player's inventory.
 */
public class HashStorage {
    private static HashMap<String, Integer> itemHashMap = new HashMap<>();

    public static HashMap<String, Integer> getItemHashMap() {
        return itemHashMap;
    }

    public static void setItemHashMap(String item, int number) {
        itemHashMap.put(item, number);
    }

    public static void removeItem(String item){
        itemHashMap.remove(item);
    }

    public static void renameItem(String newName, String oldName){
        itemHashMap.put(newName, itemHashMap.get(oldName));
        itemHashMap.remove(oldName);
    }
}
