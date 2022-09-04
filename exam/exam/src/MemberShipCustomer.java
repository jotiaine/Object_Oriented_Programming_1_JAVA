public class MemberShipCustomer extends Customer {
  private double memberShipCustomerTotalPrice;

  // Constructor
  MemberShipCustomer() {
    this.memberShipCustomerTotalPrice = 0.00; 
  } 

  // Getters
  public double getMemberShipCustomerTotalPrice() {
    return memberShipCustomerTotalPrice;
  }

  // Setters
  public void setMemberShipCustomerTotalPrice(double price1, double price2, double price3, double price4) {
    this.memberShipCustomerTotalPrice = (price1 + price2 + price3 + price4) * this.getDiscountPercentage();
  }

  // Methods
  public double calcTotalPrice() {
    return (memberShipCustomerTotalPrice + 1) * (1 - memberShipCustomerTotalPrice);
  }
}
