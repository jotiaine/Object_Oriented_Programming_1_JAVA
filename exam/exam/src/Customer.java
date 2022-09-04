public class Customer {
    private String fName;
    private String lName;
    private String tel;
    private String email;
    private String customerType;
    private double discountPercentage;
    private double[] userPrices;
    private double price1;
    private double price2;
    private double price3;
    private double price4;
    private double totalAmount;

    public Customer () {
      this.fName = "";
      this.lName = "";
      this.tel = "";
      this.email = "";
      this.customerType = "";
      this.userPrices = new double[0];
    }

    public String getFName() {
      return fName;
    }

    public void setFName(String fName) {
      this.fName = fName;
    }

    public String getLName() {
      return lName;
    }

    public void setLName(String lName) {
      this.lName = lName;
    }

    public String getTel() {
      return tel;
    }

    public void setTel(String tel) {
      this.tel = tel;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getCustomerType() {
      return customerType;
    }

    public void setCustomerType(String customerType) {
      this.customerType = customerType;
    }

    public double getDiscountPercentage() {
      return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
      this.discountPercentage = discountPercentage;
    }

    public double[] getUserPrices() {
      return userPrices;
    }

    public void setUserPrices(double[] userPrices) {
      this.userPrices = userPrices;
    }

    public double getPrice1() {
      return price1;
    }

    public void setPrice1(double price1) {
      this.price1 = price1;
    }

    public double getPrice2() {
      return price2;
    }

    public void setPrice2(double price2) {
      this.price2 = price2;
    }

    public double getPrice3() {
      return price3;
    }

    public void setPrice3(double price3) {
      this.price3 = price3;
    }

    public double getPrice4() {
      return price4;
    }

    public void setPrice4(double price4) {
      this.price4 = price4;
    }

    public double getTotalAmount() {
      return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
      this.totalAmount = totalAmount;
    }
    
}
