import java.util.Scanner;

/*
    1. Ask for a password and store it in password variable.
    2. getPassWordLength(password) returns 0 if the password is less than 12 characters and else return 1.
    3. While loop until password length is minimum of 12 characters.
*/

public class App {
    public static Scanner input;
    public static String password;
    public static int length;

    public static void main(String[] args) {
        try {
            input = new Scanner(System.in);

            // 1.
            System.out.println("Please give a password:");
            password = input.nextLine();

            // 2.
            length = getPasswordLength(password);

            // 3.
            while (true) {
                if (length == 0) {
                    System.out.println("Your password was not long enough. Minimum is 12. Please try again:");
                    password = input.nextLine();
                    length = getPasswordLength(password);
                } else {
                    System.out.println("Your password is accepted.");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    // Method to get the password length and returns 0 or 1
    public static int getPasswordLength(String password) {
        if (password.length() < 12) {
            return 0;
        } else {
            return 1;
        }
    }
}
