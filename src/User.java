import java.util.Scanner;

/**
 * Allows users to log in and out through password authentication.
 */
public class User {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner password = new Scanner(System.in);

    public static void logIn() {
        boolean wrongLogin = true;
        while (wrongLogin == true) {
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
            case "John": return password.nextLine().equals("ironYard2016");
            case "Jim": return password.nextLine().equals("yoloSwag");
            case "James": return password.nextLine().equals("Hellothere");
            default: return false;
        }
    }
}
