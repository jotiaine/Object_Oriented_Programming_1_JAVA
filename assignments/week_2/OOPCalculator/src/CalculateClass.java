public class CalculateClass {
  double number1;
  double number2;
  double sum;
  double subtraction;
  double multiplication;
  double division;

  public void addTogether(double number1, double number2) {
    sum = number1 + number2;
    System.out.println("Addition is: " + sum);
  }

  public void subtract(double number1, double number2) {
    subtraction = number1 - number2;
    System.out.println("Subtraction is: " + subtraction);
  }

  public void multiply(double number1, double number2) {
    multiplication = number1 * number2;
    System.out.println("Multiplication is: " + multiplication);
  }

  public void divide(double number1, double number2) {
    division = number1 / number2;
    System.out.println("Division is: " + division);
  }
}
