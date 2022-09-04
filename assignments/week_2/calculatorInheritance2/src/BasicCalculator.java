public class BasicCalculator extends Calculator {
  protected void plus() {
    result = num1 + num2 + num3 + num4;
    System.out.println("The addition is: " + result);
  }

  protected void minus() {
    result = num1 - num2 - num3 - num4;
    System.out.println("The subtraction is: " + result);
  }

  protected void divide() {
    result = num1 / num2 / num3 / num4;
    System.out.println("The division is: " + result);
  }

  protected void multiply() {
    result = num1 * num2 * num3 * num4;
    System.out.println("The multiplication is: " + result);
  }
}
