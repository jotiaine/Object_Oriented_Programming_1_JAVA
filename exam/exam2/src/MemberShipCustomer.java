public class MemberShipCustomer extends Customer {
  private int memberShipNumber;
  private double memberShipDiscount;

  // Constructor
  MemberShipCustomer() {
    this.memberShipNumber = 0; 
    this.memberShipDiscount = 0.90; 
  } 

  // Getters and Setters
  public int getMemberShipNumber() {
    return memberShipNumber;
  }

  public void setMemberShipNumber(int memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
  }

  public double getMemberShipDiscount() {
    return memberShipDiscount;
  }

  public void setMemberShipDiscount(double memberShipDiscount) {
    this.memberShipDiscount = memberShipDiscount;
  }
}
