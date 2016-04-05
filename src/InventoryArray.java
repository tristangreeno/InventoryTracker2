import java.util.ArrayList;

/**
 * Stores items into an ArrayList for indexing. Allows user to find item based on its index number.
 * The array list is used to rename items, and to find an item based on order of entry.
 */
public class InventoryArray {
    private final static int DEFAULT_QUANTITY = 1;
    public static ArrayList<String> listOfItemNames = new ArrayList<>();
    public static ArrayList<Integer> listOfHealingValues = new ArrayList<>();
    public static ArrayList<Integer> listOfDamageValues = new ArrayList<>();
    public static ArrayList<Integer> listOfSpaceValues = new ArrayList<>();

    public static void addToListOfItemNames(String name) {
        listOfItemNames.add(name);
        InventoryHashmap.setQuantityInventory(name, DEFAULT_QUANTITY);
    }

    public static void addToListOfHealingValues(String nameOfPotion, int value){
        listOfHealingValues.add(value);
        InventoryHashmap.setHealingValueOfPotion(nameOfPotion, value);
    }

    public static void addToListOfDamageValues(String nameOfWeapon, int damageValue){
        listOfDamageValues.add(damageValue);
        InventoryHashmap.setWeaponDamageValue(nameOfWeapon, damageValue);
    }

    public static void addToListOfSpaceValues(String itemName, int spacesTaken){
        listOfSpaceValues.add(spacesTaken);
        InventoryHashmap.setInventorySpacesUsed(itemName, spacesTaken);
    }

    public static void renameItem(String oldName, String newName) {
        InventoryHashmap.renameItemInInventory(newName, oldName);
        listOfItemNames.set(listOfItemNames.indexOf(oldName), newName);
    }

    public static void removeFromList(int numberOfItem) {
        InventoryHashmap.removeItemFromInventory(listOfItemNames.get(numberOfItem));
        listOfItemNames.remove(numberOfItem);
    }
}
