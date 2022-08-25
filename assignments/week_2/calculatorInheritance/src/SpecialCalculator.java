import java.util.Arrays;

public class SpecialCalculator extends Calculator {
  protected void getSortedArr() {
    double[] nums = { num1, num2, num3, num4 };
    Arrays.sort(nums);
    System.out.println("The sorted array is: " + Arrays.toString(nums));
  }

  protected void getSquareRootNum1() {
    System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1));
  }

  protected void getSquareRootNum2() {
    System.out.println("The square root of " + num2 + " is " + Math.sqrt(num2));
  }

  protected void getSquareRootNum3() {
    System.out.println("The square root of " + num3 + " is " + Math.sqrt(num3));
  }

  protected void getSquareRootNum4() {
    System.out.println("The square root of " + num4 + " is " + Math.sqrt(num4));
  }

  protected void getCirclePerimeterNum1() {
    System.out.println("The circle perimeter is " + (2 * Math.PI * num1) + " for radius " + num1);
  }

  protected void getCirclePerimeterNum2() {
    System.out.println("The circle perimeter is " + (2 * Math.PI * num2) + " for radius " + num2);
  }

  protected void getCirclePerimeterNum3() {
    System.out.println("The circle perimeter is " + (2 * Math.PI * num3) + " for radius " + num3);
  }

  protected void getCirclePerimeterNum4() {
    System.out.println("The circle perimeter is " + (2 * Math.PI * num4) + " for radius " + num4);
  }

  protected void getCircleAreaNum1() {
    System.out.println("The circle area is " + (Math.PI * Math.pow(num1, 2)) + " for radius " + num1);
  }

  protected void getCircleAreaNum2() {
    System.out.println("The circle area is " + (Math.PI * Math.pow(num2, 2)) + " for radius " + num2);
  }

  protected void getCircleAreaNum3() {
    System.out.println("The circle area is " + (Math.PI * Math.pow(num3, 2)) + " for radius " + num3);
  }

  protected void getCircleAreaNum4() {
    System.out.println("The circle area is " + (Math.PI * Math.pow(num4, 2)) + " for radius " + num4);
  }
}
