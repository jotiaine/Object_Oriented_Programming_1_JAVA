import java.util.Scanner;

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

            // Testing encapsulation
            // System.out.println(myObj.number1); not allowed -> Encapsulation is working
            // System.out.println(myObj.number2); not allowed -> Encapsulation is working

            System.out.println("Number 1 is: " + myObj.getNumber1());
            System.out.println("Number 2 is: " + myObj.getNumber2());
            myObj.setNumber1(100);
            myObj.setNumber2(10);
            System.out.println("Number 1 is: " + myObj.getNumber1());
            System.out.println("Number 2 is: " + myObj.getNumber2());
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
