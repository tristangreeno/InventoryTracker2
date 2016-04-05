import java.util.HashMap;
import java.util.Scanner;

/**
 * Main will greet the user with a statement, and then call upon the control system, which uses a Switch statement to
 * perform certain actions based on user input.
 * The program stores data given by the user into an array for indexing purposes, and then into a hashmap in order to
 * print information about each item in the inventory, such as the damage of a weapon.
 * Controls the program by allowing user input to dictate what the program will do next.
 * Will loop infinitely to accept new users and items.
 * Numerous scanner objects are to prevent one line of input from bleeding into another.
 * The categories of each object are stored into the categoryOfItem map.
 */
public class InventorySystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner itemName = new Scanner(System.in);
    private static Scanner category = new Scanner(System.in);
    private static Scanner itemNumber = new Scanner(System.in);
    private static Scanner numberOfItems = new Scanner(System.in);
    private static Scanner itemUpdateName = new Scanner(System.in);
    private static Scanner oldName = new Scanner(System.in);
    private static Scanner newName = new Scanner(System.in);

    public static HashMap<String, InventoryItem> categoryOfItem = new HashMap<>();

    public static void main(String args[]) {
        System.out.println("Welcome to the Inventory Tracker!");
        User.logIn();
        while (true) {

            PrintStorage.printStorage();
            System.out.println("Enter 1 to create a new item, and enter its name.");
            System.out.println("Enter 2 to remove an item by its number.");
            System.out.println("Enter 3 to update the quantity of an item.");
            System.out.println("Enter 4 to update the name of an item.");
            System.out.println("Enter 5 to log out.");
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Enter the name of the item.");
                    String nameOfItem = itemName.nextLine();
                    InventoryArray.addToListOfItemNames(nameOfItem);

                    System.out.println("Enter the category of item.");
                    System.out.println("Categories: Bow, Spear, Sword, Potion, Staff");

                    switch (category.nextLine()){
                        case "Sword":
                            Sword sword = new Sword();
                            categoryOfItem.put(nameOfItem, sword.createItem(nameOfItem, 13, 3));
                            InventoryArray.addToListOfDamageValues(nameOfItem, 13);
                            InventoryArray.addToListOfSpaceValues(nameOfItem, 3);
                            break;
                        case "Spear":
                            Spear spear = new Spear();
                            categoryOfItem.put(nameOfItem, spear.createItem(nameOfItem, 22, 5));
                            InventoryArray.addToListOfDamageValues(nameOfItem, 22);
                            InventoryArray.addToListOfSpaceValues(nameOfItem, 5);
                            break;
                        case "Potion":
                            Potion potion = new Potion();
                            categoryOfItem.put(nameOfItem, potion.createItem(nameOfItem, 40, 2));
                            InventoryArray.addToListOfHealingValues(nameOfItem, 40);
                            InventoryArray.addToListOfSpaceValues(nameOfItem, 2);
                            break;
                        case "Bow":
                            Bow bow = new Bow();
                            categoryOfItem.put(nameOfItem, bow.createItem(nameOfItem, 33, 3));
                            InventoryArray.addToListOfDamageValues(nameOfItem, 33);
                            InventoryArray.addToListOfSpaceValues(nameOfItem, 3);
                            break;
                        case "Staff":
                            Staff staff = new Staff();
                            categoryOfItem.put(nameOfItem, staff.createItem(nameOfItem, 26, 4));
                            InventoryArray.addToListOfDamageValues(nameOfItem, 26);
                            InventoryArray.addToListOfSpaceValues(nameOfItem, 4);
                            break;
                        default:
                            System.out.println("Please enter a valid category.");
                    }

                    break;

                case "2":
                    System.out.println("Enter the number of item.");
                    InventoryArray.removeFromList(itemNumber.nextInt());
                    break;

                case "3":
                    System.out.println("Enter the name of item, then its number.");
                    InventoryHashmap.setQuantityInventory(itemUpdateName.nextLine(), numberOfItems.nextInt());
                    break;

                case "4":
                    System.out.println("Enter the name of the item, and then the name you wish to give it.");
                    InventoryArray.renameItem(oldName.nextLine(), newName.nextLine());
                    break;

                case "5":
                    System.out.println("You have logged out.");
                    User.logIn();

                default:
                    System.out.println("Please enter a valid number (1-5).");
            }
        }
    }
}
