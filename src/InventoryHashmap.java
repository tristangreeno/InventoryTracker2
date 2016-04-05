import java.util.HashMap;

/**
 * Stores the data concerning the number of each item in a player's inventory.
 */
public class InventoryHashmap {
    private static HashMap<String, Integer> itemQuantityInventory = new HashMap<>();
    private static HashMap<String, Integer> weaponDamage = new HashMap<>();
    private static HashMap<String, Integer> itemSpaces = new HashMap<>();
    private static HashMap<String, Integer> potionHealing = new HashMap<>();

    public static HashMap<String, Integer> getItemQuantityInventory() {
        return itemQuantityInventory;
    }

    public static void setQuantityInventory(String itemName, int quantity) {
        itemQuantityInventory.put(itemName, quantity);
    }

    public static void setHealingValueOfPotion(String itemName, int value){
        potionHealing.put(itemName, value);
    }

    public static void setInventorySpacesUsed(String itemName, int spacesTaken){
        itemSpaces.put(itemName, spacesTaken);
    }

    public static void setWeaponDamageValue(String itemName, int value){
        weaponDamage.put(itemName, value);
    }

    public static void removeItemFromInventory(String item){
        itemQuantityInventory.remove(item);
    }

    public static void renameItemInInventory(String newName, String oldName){
        itemQuantityInventory.put(newName, itemQuantityInventory.get(oldName));
        itemQuantityInventory.remove(oldName);
    }


}
