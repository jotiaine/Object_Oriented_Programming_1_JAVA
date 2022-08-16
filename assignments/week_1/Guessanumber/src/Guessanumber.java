import java.util.Scanner;

public class Guessanumber {
    static void guessANumber() {
        int randomNum = (int)(Math.random() * 11);
        Scanner input = new Scanner(System.in);
    
        while(true) {
            System.out.println("Guess a number between 0  and 10: ");
            int guess = input.nextInt();
    
            if (guess == randomNum) {
                System.out.println("Congratulations, your guess is correct, the number was " + randomNum);
                break;
            } else if (guess > randomNum) {
                System.out.println("Guess again, a randomized number is smaller");
            } else {
                System.out.println("Guess again, a randomized number is bigger");
            }
    
        }
        input.close();
    }

    public static void main(String[] args) {
        guessANumber();
    }
}
