import java.util.Scanner;

public class Months {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month(1-12): ");
        int month = input.nextInt();       
        String days30 = "30 days";
        String days31 = "31 days";


        switch (month) {
            case 1:
                System.out.println(days31);
                break;
            case 2:
                System.out.println("Enter a year(>=0): ");
                int year = input.nextInt(); // Extra, voisi katsoa vuoden myös java.time package avulla

                if (year < 0) {
                    System.out.println("Invalid year");
                } else {
                    if(year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                }
                break;
            case 3:
                System.out.println(days31);
                break;
            case 4:
                System.out.println(days30);
                break;
            case 5:
                System.out.println(days31);
                break;
            case 6:
                System.out.println(days30);
                break;
            case 7:
                System.out.println(days31);
                break;
            case 8:
                System.out.println(days31);
                break;
            case 9:
                System.out.println(days30);
                break;
            case 10:
                System.out.println(days31);
                break;
            case 11:
                System.out.println(days30);
                break;
            case 12:
                System.out.println(days31);
                break;
            default:
                System.out.println("Invalid month");
        }
    }   
}
