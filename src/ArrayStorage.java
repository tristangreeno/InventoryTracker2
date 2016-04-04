import java.util.ArrayList;

/**
 * Stores items into an ArrayList for indexing. Allows user to find item based on its index number.
 */
public class ArrayStorage {
    public static ArrayList<String> itemList = new ArrayList<>();

    public static void setItemList(String name) {
        itemList.add(name);
        HashStorage.setItemHashMap(name, 1);
    }

    public static void renameItem(String oldName, String newName) {
        HashStorage.renameItem(newName, oldName);
        itemList.set(itemList.indexOf(oldName), newName);
    }

    public static void removeFromList(int numberOfItem) {
        HashStorage.removeItem(itemList.get(numberOfItem));
        itemList.remove(numberOfItem);
    }
}
