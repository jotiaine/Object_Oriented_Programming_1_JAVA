public class Car {
  String model;

  int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public String carAndYear() {
    return model + " " + year;
  }
}
