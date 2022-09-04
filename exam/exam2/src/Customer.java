public class Customer {
    private String customerFirstName;
    private String customerSurName;
    private String customerPhone;
    private String customerEmail;

    public Customer () {
      this.customerFirstName = "";
      this.customerSurName = "";
      this.customerPhone = "";
      this.customerEmail = "";
    }

    public String customerFirstName() {
      return customerFirstName;
    }

    public void customerFirstName(String customerFirstName) {
      this.customerFirstName = customerFirstName;
    }

    public String customerSurName() {
      return customerSurName;
    }

    public void customerSurName(String customerSurName) {
      this.customerSurName = customerSurName;
    }

    public String customerPhone() {
      return customerPhone;
    }

    public void customerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
    }

    public String customerEmail() {
      return customerEmail;
    }

    public void customerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
    }    
}
