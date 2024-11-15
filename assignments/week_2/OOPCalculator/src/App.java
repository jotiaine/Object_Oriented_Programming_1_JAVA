import java.util.Scanner;

/*
    1. Create a class called CalculateClass
        1.1 with vars number1, number2 and basic aritmetic operation methods
    2. Make an instance(copy/object) of the class CalculateClass
    3. askUser method asks user for two numbers and what to do with them
       3.1 Based on the user's choice perform methods from CalculateClass
       3.2 While loop the function and quit if choice is 5
       3.3 When inside the choices loop if choice is 1 and quit the program is choice is 1
*/

public class App {
    static Scanner input;
    static CalculateClass myObj;
    static double number1;
    static double number2;
    static int choice;

    public static void main(String[] args) throws Exception {
        try {
            input = new Scanner(System.in);

            // 2.
            myObj = new CalculateClass();

            // 3.
            askUser();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static void askUser() {
        // 3.2
        while (true) {

            System.out.println("Enter a number: ");
            number1 = input.nextDouble();
            System.out.println("Enter another number: ");
            number2 = input.nextDouble();
            System.out.println("What do you want to do with the numbers:");
            System.out.println("1) Add together");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Quit the program");
            System.out.println("Please enter your choice:");
            choice = input.nextInt();

            // 3.1
            if (choice == 1) {
                myObj.addTogether(number1, number2);
                continueOrQuit();

                // 3.3
                if (choice == 2)
                    break;
            } else if (choice == 2) {
                myObj.subtract(number1, number2);
                continueOrQuit();

                // 3.3
                if (choice == 2)
                    break;
            } else if (choice == 3) {
                myObj.multiply(number1, number2);
                continueOrQuit();

                // 3.3
                if (choice == 2)
                    break;
            } else if (choice == 4) {
                myObj.divide(number1, number2);
                continueOrQuit();

                // 3.3
                if (choice == 2)
                    break;
            } else if (choice == 5)
                break;
            else
                System.out.println("Invalid choice");
        }
    }

    public static void continueOrQuit() {
        System.out.println("Do you want to continue or quit the program? (1) Continue or (2) Quit");
        choice = input.nextInt();
    }

}
