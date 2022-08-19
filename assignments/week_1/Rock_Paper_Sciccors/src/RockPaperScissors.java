import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String userName = "";
        int userScore = 0;
        int computerScore = 0;
        int userChoice;
        int computerChoice;
        boolean playAgain = true;
        String[] choices = { "rock", "paper", "scissors" };

        // Game starts
        try {
            System.out.println("Enter your name: ");
            userName = input.nextLine();
            for (int i = 0; i < 50; ++i)
                System.out.println();

            System.out.println("Hello " + userName + "!");
            System.out.println("Let's play Rock, Paper, Scissors!");
            System.out.println("Good luck against the Computer!");

            // Play again
            while (playAgain) {
                System.out.println("Enter your choice: ");
                System.out.println("1) rock");
                System.out.println("2) paper");
                System.out.println("3) scissors");
                userChoice = input.nextInt();
                input.nextLine();

                for (int i = 0; i < 50; ++i)
                    System.out.println();

                computerChoice = (int) (Math.random() * 3) + 1;
                // System.out.println("The computer chose " + computerChoice);
                if (userChoice == 1 && computerChoice == 1) {
                    System.out.println("It's a draw!");
                } else if (userChoice == 1 && computerChoice == 2) {
                    System.out.println("You lose!");
                    computerScore++;
                } else if (userChoice == 1 && computerChoice == 3) {
                    System.out.println("You win!");
                    System.out.println("The computer chose " + choices[computerChoice - 1]);
                    userScore++;
                } else if (userChoice == 2 && computerChoice == 1) {
                    System.out.println("You win!");
                    System.out.println("The computer chose " + choices[computerChoice - 1]);
                    userScore++;
                } else if (userChoice == 2 && computerChoice == 2) {
                    System.out.println("It's a draw!");
                } else if (userChoice == 2 && computerChoice == 3) {
                    System.out.println("You lose!");
                    computerScore++;
                } else if (userChoice == 3 && computerChoice == 1) {
                    System.out.println("You lose!");
                    computerScore++;
                } else if (userChoice == 3 && computerChoice == 2) {
                    System.out.println("You win!");
                    System.out.println("The computer chose " + choices[computerChoice - 1]);
                    userScore++;
                } else if (userChoice == 3 && computerChoice == 3) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println("Invalid input!");
                }
                System.out.println("Your score: " + userScore);
                System.out.println("Computer's score: " + computerScore);

                System.out.println("Want to play again? (y/n)");
                String answer = input.nextLine();
                if (answer.equals("y") || answer.equals("Y")) {
                    playAgain = true;

                    for (int i = 0; i < 50; ++i)
                        System.out.println();
                } else {
                    playAgain = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Thank you for playing!");
            input.close();
        }

    }
}
