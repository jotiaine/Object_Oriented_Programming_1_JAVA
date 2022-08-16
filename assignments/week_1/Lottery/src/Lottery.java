import java.util.Scanner;

public class Lottery {
    
    static void testAgain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to see another set of lottery numbers? (y/n)");
        String answer = input.nextLine();

        if(answer.equals("Y") || answer.equals("y")) {
            getLotteryNumbers();
        }

        input.close();
    }

    static int getRandomNumber() {
        return ((int) (Math.random() * 39)) + 1;
    }

    static void getLotteryNumbers () {
        Scanner input = new Scanner(System.in);
        int[] lotteryNumbers = {0, 0, 0, 0, 0, 0, 0};

        // Generate 7 random unique lotto numbers
        for (int i = 0; i < 7; i++) {
            int randomNumber = getRandomNumber();
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (randomNumber == lotteryNumbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                lotteryNumbers[i] = randomNumber;
            } else {
                i--;
            }
        }

        // Print array
        System.out.print("Randomized lottery numbers are: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotteryNumbers[i] + ", ");
        }
        System.out.print(lotteryNumbers[6]);
        System.out.println();

        // Test again?
        testAgain();

        input.close();
    }

    public static void main(String[] args) {
        getLotteryNumbers();
    }
}
