import java.util.Scanner;

/*
 *  1. Ask what the user wants to calculate(*+-/)
 *    1.1 Ask for numbers for calculations
 *    1.2 Print given numbers
 *    1.3 Call chosen basicCalculator method depending on the user's choice(1, 2  3, 4) 
 *    1.4 Ask user what specialCalculation he/she wants to do
 *    1.5 Call chosen specialCalculator method depending on the user's choice(1, 2  3, 4)
 *  2. Main class makes instances of Calculator: BasicCalculator, SpecialCalculator
 *  3. Loop 1. - 1.5 until the user wants to quit 
 */

public class App {
    private static Scanner input;
    private static Calculator calculator;
    private static BasicCalculator basicCalculator;
    private static SpecialCalculator specialCalculator;
    private static int choice;

    public static void main(String[] args) throws Exception {
        try {
            input = new Scanner(System.in);

            // 2. Main class makes instances of Calculator: BasicCalculator,
            // SpecialCalculator
            calculator = new Calculator();
            basicCalculator = new BasicCalculator();
            specialCalculator = new SpecialCalculator();

            System.out.println("Welcome to the calculator app!");

            // 3. Loop steps 1. - 1.5 until the user wants to quit
            while (true) {
                // 1. Ask what the user wants to calculate(*+-/)
                System.out.println("What do you want to calculate?");
                System.out.println("1) +");
                System.out.println("2) -");
                System.out.println("3) /");
                System.out.println("4) *");
                System.out.println("5) Quit the program");
                System.out.println("Please enter your choice:");
                choice = input.nextInt();
                System.out.println();

                if (choice == 5) {
                    break;
                }

                // 1.1 Ask for numbers for calculations
                System.out.println("Enter 4 numbers:");
                System.out.println("Enter number 1:");
                basicCalculator.setNum1(input.nextDouble());
                specialCalculator.setNum1(basicCalculator.getNum1());
                System.out.println("Enter number 2:");
                basicCalculator.setNum2(input.nextDouble());
                specialCalculator.setNum2(basicCalculator.getNum2());
                System.out.println("Enter number 3:");
                basicCalculator.setNum3(input.nextDouble());
                specialCalculator.setNum3(basicCalculator.getNum3());
                System.out.println("Enter number 4:");
                basicCalculator.setNum4(input.nextDouble());
                specialCalculator.setNum4(basicCalculator.getNum4());
                System.out.println("");

                // 1.2 Print given numbers using super Class
                System.out.println("You entered numbers:");
                System.out.println("Number 1: " + basicCalculator.getNum1());
                System.out.println("Number 2: " + basicCalculator.getNum2());
                System.out.println("Number 3: " + basicCalculator.getNum3());
                System.out.println("Number 4: " + basicCalculator.getNum4());
                System.out.println("");

                // 1.3 Call basicCalculator method depending on the user's choice
                if (choice == 1) {
                    basicCalculator.plus();
                } else if (choice == 2) {
                    basicCalculator.minus();
                } else if (choice == 3) {
                    basicCalculator.divide();
                } else if (choice == 4) {
                    basicCalculator.multiply();
                } else {
                    System.out.println("Invalid choice");
                }

                // 1.4 Ask user what specialCalculation he/she wants to do
                System.out.println();
                System.out.println("What special calculations do you want to calculate?");
                System.out.println("1) Return numbers in a sorted array");
                System.out.println("2) Square root of each number");
                System.out.println("3) Circle perimeter with each number");
                System.out.println("4) Circle area with each number");
                System.out.println("5) Quit the program");
                System.out.println("Please enter your choice:");
                choice = input.nextInt();
                System.out.println();

                // 1.5 Call chosen specialCalculator method depending on the user's choice
                if (choice == 1) {
                    specialCalculator.getSortedArr();
                } else if (choice == 2) {
                    specialCalculator.getSquareRootNum1();
                    specialCalculator.getSquareRootNum2();
                    specialCalculator.getSquareRootNum3();
                    specialCalculator.getSquareRootNum4();
                } else if (choice == 3) {
                    specialCalculator.getCirclePerimeterNum1();
                    specialCalculator.getCirclePerimeterNum2();
                    specialCalculator.getCirclePerimeterNum3();
                    specialCalculator.getCirclePerimeterNum4();
                } else if (choice == 4) {
                    specialCalculator.getCircleAreaNum1();
                    specialCalculator.getCircleAreaNum2();
                    specialCalculator.getCircleAreaNum3();
                    specialCalculator.getCircleAreaNum4();
                } else if (choice == 5) {
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
                System.out.println();

            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
