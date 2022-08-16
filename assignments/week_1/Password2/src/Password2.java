import java.util.Scanner;

public class Password2 {
    
    public static void main(String[] args) throws Exception {
        // Vars
        String firstName = "asd";
        String lastName = "asd";
        int age = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.print("Give your first name: ");
        firstName = myObj.nextLine();

        System.out.print("Give your last name: ");
        lastName = myObj.nextLine();

        System.out.print("Give your age: ");
        age = myObj.nextInt();


        char secondLetterOfFName = firstName.charAt(1);
        char firstLetterOfLName = Character.toLowerCase(lastName.charAt(0));
        int lengthTogether = firstName.length() + lastName.length();
        String lastTwoLettersOfFName = firstName.substring(firstName.length() - 2).toUpperCase();
        int random1 = (int)(Math.random() * 10);
        int random2 = (int)(Math.random() * 10);

        String password = secondLetterOfFName + Integer.toString(age) + firstLetterOfLName + Integer.toString(lengthTogether) + lastTwoLettersOfFName + random1 + random2;
        System.out.println("Your new password is: " + password);

        myObj.close();
    }   
}
