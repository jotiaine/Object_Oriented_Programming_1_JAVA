import java.util.Scanner; // import the Scanner class

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner myObj = new Scanner(System.in); // Create scanner object
        System.out.println("Enter username: ");
        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is " + userName);
    }
}
