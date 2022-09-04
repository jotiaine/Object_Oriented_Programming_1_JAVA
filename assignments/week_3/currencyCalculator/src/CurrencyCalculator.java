import java.util.Scanner;

public class CurrencyCalculator {
  private Scanner input;
  private double euros;
  private double usd;

  public CurrencyCalculator() {
    input = new Scanner(System.in);
  }

  public void askUser() {
    while (true) {
      System.out.println("Hello to currency Calculator!");
      System.out.println("Give me amount of euros to convert: ");
      euros = input.nextDouble();
      System.out.println("What currency do you want to convert to?");
      System.out.println("1. USD");
      System.out.println("2. GBP");
      System.out.println("3. CHF");
      System.out.println("4. JPY");

      int choice = input.nextInt();
      if (choice == 1) {
        usd = euros;
        System.out.println("You have " + usd + " USD");
      } else if (choice == 2) {
        usd = euros * 0.86;
        System.out.println("You have " + usd + " GBP");
      } else if (choice == 3) {
        usd = euros * 0.98;
        System.out.println("You have " + usd + " CHF");
      } else if (choice == 4) {
        usd = euros * 139.71;
        System.out.println("You have " + usd + " JPY");
      } else {
        System.out.println("Wrong choice! Quitting program...");
        input.close();
        break;
      }

    }
  }
}