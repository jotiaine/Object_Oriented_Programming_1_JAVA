public class Calculator {
  private double num1;
  private double num2;
  private double num3;
  private double num4;
  private double result;

  // Constructor
  public Calculator(double num1, double num2, double num3, double num4, double result) {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
    this.num4 = num4;
    this.result = result;
  }

  // Getters and setters
  public double getNum1() {
    return num1;
  }

  public void setNum1(double newNum1) {
    this.num1 = newNum1;
  }

  public double getNum2() {
    return num2;
  }

  public void setNum2(double newNum2) {
    this.num2 = newNum2;
  }

  public double getNum3() {
    return num3;
  }

  public void setNum3(double newNum3) {
    this.num3 = newNum3;
  }

  public double getNum4() {
    return num4;
  }

  public void setNum4(double newNum4) {
    this.num4 = newNum4;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double newResult) {
    this.result = newResult;
  }
}
