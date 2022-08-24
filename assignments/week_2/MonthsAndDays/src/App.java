import java.util.Scanner;

/*
    1. Init accessible Vars
    2. Display choices
    3. Process and display results for the choices

    Ps. days and months could be seperate classes(Days & Months or DaysAndMonths) properties
    which would be easy to access with an object instance of the class
    with the var year    
*/

public class App {
    // 1. Init accessible Vars
    public static Scanner input;
    public static int choice;
    public static int year;
    public static int days;
    public static int months;

    public static void main(String[] args) throws Exception {
        try {
            input = new Scanner(System.in);

            // 2. Display choices
            System.out.println("How long has a person lived:");
            System.out.println("1) In days");
            System.out.println("2) In months");
            System.out.println("Please enter your choice:");
            choice = input.nextInt();
            System.out.println();
            System.out.println("Please enter the birth year>");
            year = input.nextInt();
            System.out.println();

            // 3. Process and display results for the choices
            if (choice == 1) {
                days(year);
            } else if (choice == 2) {
                months(year);
            } else {
                System.out.println("Invalid choice");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    // days method
    public static void days(int year) {
        days = (2022 - year) * 356;
        System.out.println("You have lived " + days + " days");
    }

    // months method
    public static void months(int year) {
        months = (2022 - year) * 12;
        System.out.println("You have lived " + months + " months");
    }
}
