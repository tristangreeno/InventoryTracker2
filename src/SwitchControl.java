import java.util.Scanner;

/**
 * Controls the program by allowing user input to dictate what the program will do next.
 * Will loop infinitely.
 */
public class SwitchControl {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner itemRemoveName = new Scanner(System.in);
    private static Scanner itemNumber = new Scanner(System.in);
    private static Scanner numberOfItems = new Scanner(System.in);
    private static Scanner itemUpdateName = new Scanner(System.in);
    private static Scanner oldName = new Scanner(System.in);
    private static Scanner newName = new Scanner(System.in);

    public static void switchStatement() {
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
                    ArrayStorage.setItemList(itemRemoveName.nextLine());
                    break;
                case "2":
                    System.out.println("Enter the number of item.");
                    ArrayStorage.removeFromList(itemNumber.nextInt());
                    break;
                case "3":
                    System.out.println("Enter the name of item, then its number.");
                    HashStorage.setItemHashMap(itemUpdateName.nextLine(), numberOfItems.nextInt());
                    break;
                case "4":
                    System.out.println("Enter the name of the item, and then the name you wish to give it.");
                    ArrayStorage.renameItem(oldName.nextLine(), newName.nextLine());
                    break;
                case "5":
                    System.out.println("You have logged out.");
                    User.logIn();I
                default:
                    System.out.println("Please enter a valid number (1-5).");
            }
        }
    }
}
