import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        
        String firstName ="";
        int age=0;
        double height=0.00;
        // String input
        System.out.println("Your name: ");
        firstName = myObj.nextLine();

        // Round number and decimal
        System.out.println("Your age: ");
        age = myObj.nextInt();
        System.out.println("Your height: ");
        height = myObj.nextDouble();

        // Output the users input
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // Close the scanner object
        myObj.close();
    }
}
