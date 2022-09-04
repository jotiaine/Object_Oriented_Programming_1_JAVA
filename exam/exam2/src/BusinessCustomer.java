
public class BusinessCustomer extends Customer {
  private double companyDiscount;
  private String companyName;

  // Constructor
  BusinessCustomer() {
    this.companyDiscount = 0.95; 
    this.companyName = ""; 
  } 

  // Getters and Setters
  public double getCompanyDiscount() {
    return companyDiscount;
  }

  public void setCompanyDiscount(double companyDiscount) {
    this.companyDiscount = companyDiscount;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
}
