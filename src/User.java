import java.util.Scanner;

/**
 * Allows users to log in and out through password authentication.
 * If the user is not found, or the password is incorrect, the inventory system may not be touched.
 * Will loop through infinitely until boolean is set to false from entering a correct username/password.
 * Passwords stored into final static string to prevent tampering.
 */
public class User {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner password = new Scanner(System.in);
    private final static String johnPassword = "ironYard2016";
    private final static String jimPassword = "yoloSwag";
    private final static String jamesPassword = "Hellothere";

    public static void logIn() {
        boolean wrongLogin = true;
        while (wrongLogin) {
            System.out.println("Please enter your username.");
            switch (scanner.nextLine()) {
                case "John":
                    if (enterPassword("John")) {
                        System.out.println("Welcome, John.");
                        wrongLogin = false;
                    } else System.out.println("Username and password do not match.");
                    break;
                case "Jim":
                    if (enterPassword("Jim")) {
                        System.out.println("Welcome, Jim.");
                        wrongLogin = false;
                    } else System.out.println("Username and password do not match.");
                    break;
                case "James":
                    if (enterPassword("James")) {
                        System.out.println("Welcome, James.");
                        wrongLogin = false;
                    } else System.out.println("Username and password do not match.");
                    break;
                default:
                    System.out.println("Invalid username entered. Please try again.");
            }
        }
    }

    private static boolean enterPassword(String name) {
        System.out.println("Please enter your password.");
        switch (name){
            case "John": return password.nextLine().equals(johnPassword);
            case "Jim": return password.nextLine().equals(jimPassword);
            case "James": return password.nextLine().equals(jamesPassword);
            default: return false;
        }
    }
}
