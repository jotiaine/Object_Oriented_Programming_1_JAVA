// Could be done also with a constructor and then with getters and setters

public class CalculateClass {
  private double number1;
  private double number2;
  private double sum;
  private double subtraction;
  private double multiplication;
  private double division;

  public double getNumber1() {
    return number1;
  }

  protected void setNumber1(double newNumber1) {
    number1 = newNumber1;
  }

  protected double getNumber2() {
    return number2;
  }

  protected void setNumber2(double newNumber2) {
    number2 = newNumber2;
  }

  protected void addTogether(double number1, double number2) {
    sum = number1 + number2;
    System.out.println("Addition is: " + sum);
  }

  protected void subtract(double number1, double number2) {
    subtraction = number1 - number2;
    System.out.println("Subtraction is: " + subtraction);
  }

  protected void multiply(double number1, double number2) {
    multiplication = number1 * number2;
    System.out.println("Multiplication is: " + multiplication);
  }

  protected void divide(double number1, double number2) {
    division = number1 / number2;
    System.out.println("Division is: " + division);
  }
}