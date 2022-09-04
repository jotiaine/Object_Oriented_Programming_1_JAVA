
public class BusinessCustomer extends Customer {
  private double businessCustomerTotalPrice;

  // Constructor
  BusinessCustomer() {
    this.businessCustomerTotalPrice = 0.00; 
  } 

  // Getters
  public double getBusinessCustomerTotalPrice() {
    return businessCustomerTotalPrice;
  }

  // Setters
  public void setBusinessCustomerTotalPrice(double price1, double price2, double price3, double price4) {
    this.businessCustomerTotalPrice = (price1 + price2 + price3 + price4) * this.getDiscountPercentage();
  }

  // Methods
  public double calcTotalPrice() {
    return (businessCustomerTotalPrice + 1) * (1 - businessCustomerTotalPrice);
  }
}
