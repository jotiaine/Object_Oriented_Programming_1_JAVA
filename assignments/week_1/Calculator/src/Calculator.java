import java.util.Scanner;

public class Calculator {
    public static int calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Please select operation: 1) + 2)- 3)* 4)/");
        int operation = input.nextInt();
    
        int result = 0;
        if(operation == 1) {
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 - num2;
        } else if (operation == 3) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
    
        System.out.println("Result of the calculation is: " + result);
        input.close();
        return result;
    }

    public static void main(String[] args) throws Exception {
        calculate();
    }
}
