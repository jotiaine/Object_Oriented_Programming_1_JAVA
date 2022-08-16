import java.util.Scanner;

public class Increment {
    static void askNumbers () {
        Scanner input = new Scanner(System.in);
        int count = 0;

        do {
            System.out.println("Give a number: ");
            int number = input.nextInt();
            count += number;
        } while (count < 30);

        System.out.println("30 has been reached");
        input.close();
    }

    public static void main(String[] args) {
        askNumbers();
    }
}
