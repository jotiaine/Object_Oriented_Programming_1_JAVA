/*
  * 1. Ask user prices of items he/she wants to buy.
  *     1.1 askUserPrices()
  * 2. Ask customer's basic info: fName, lName, tel, email.
  * 3. Ask user's customer type: business, member or normal.
  * 4. Check customer's discount percentage
  *  - If business customer -> discount percentage is 10%.
  *  - If member customer -> discount percentage is 5%.
  *  - If neither type -> discount percentage is 0.
  * 5. Ask if the cashier wants to add a new customer.
  *     5.1 Yes - continue(repeat loop)
  *     5.2 No - break loop
  * 6. Tell/Print customer's total amount
*/

import java.util.Scanner;

public class MainCashier {
    // Variables
    private static Scanner input;
    private static Customer customer;
    private static BusinessCustomer businessCustomer;
    private static MemberShipCustomer memberShipCustomer;
    private static double price1;
    private static double price2;
    private static double price3;
    private static double price4;
    private static String fName;
    private static String lName;
    private static String tel;
    private static String email;
    private static int customerType;
    private static double total;
    private static int newCustomer;
    private static double businessTotal;
    private static double memberTotal;

    public static void main(String[] args) {
    try {
    
        // Input
        input = new Scanner(System.in);
        System.out.println("Welcome to the cashier program!");

        // Instances
        customer = new Customer();
        businessCustomer = new BusinessCustomer();
        memberShipCustomer = new MemberShipCustomer();

        System.out.println(businessCustomer.getFName());
        System.out.println(memberShipCustomer.getFName());

        
        while (true) {
            // 1. Ask user prices of items he/she wants to buy. 
            askUserPrices();

            // 2. Ask customer's basic info: fName, lName, tel, email.
            askCustomerBasicInfo();
 
            // 3. Check user's customer type: business, member or normal.
            checkCustomerType();

        
            // 4. Check customer's discount percentage
            if (customerType == 1) {
                businessTotal = makeBusinessInstance();
                
                // 6. Tell/Print customer's total amount
                System.out.println("Your total is: " + businessTotal);

            } else if (customerType == 2) {
                memberTotal = makeMemberInstance();
               
                // 6. Tell/Print customer's total amount
                System.out.println("Your total is: " + memberTotal);
                
            }  else if(customerType == 3) {

                total = price1 + price2 + price3 + price4;
                // 6. Tell/Print customer's total amount
                System.out.println("Your total is: " + total);
            } else {
                System.out.println("Invalid input");
            }
        
            // 5. Ask if the cashier wants to add a new customer
            System.out.println();
            System.out.println("Do you want to add a new customer?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            newCustomer = input.nextInt();
        
            if(newCustomer == 1) {
                // 5.1 Yes - continue(repeat loop)  
                continue;
            } else if (newCustomer == 2) {
                // 5.2 No - break loop
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Thank you for using the program");

    } catch (Exception e) {
            System.out.println("Error " + e.getMessage());        
        }
    }

    // Methods
    public static void askUserPrices() {
        System.out.println("Please enter the prices of the items you want to buy:");
        price1 = input.nextDouble();
        price2 = input.nextDouble();
        price3 = input.nextDouble();
        price4 = input.nextDouble();

        customer.setPrice1(price1);
        customer.setPrice2(price2);
        customer.setPrice3(price3);
        customer.setPrice4(price4);
    };
    
    public static void askCustomerBasicInfo() {
        input.nextLine();
        System.out.println("Please enter your first name:");
        fName = input.nextLine();
        System.out.println("Please enter your last name:");
        lName = input.nextLine();
        System.out.println("Please enter your phone number:");
        tel = input.nextLine();
        System.out.println("Please enter your email:");
        email = input.nextLine();
    };

    public static void checkCustomerType() {
        System.out.println();
        System.out.println("Are you a business customer or a member customer or normal customer?");
        System.out.println("1) Business customer");
        System.out.println("2) Member customer");
        System.out.println("3) Normal customer");
        System.out.println("Please enter your customer type:");
        customerType = input.nextInt();
        System.out.println();
    };

    public static double makeBusinessInstance() {
        businessCustomer.setFName(fName);
        businessCustomer.setLName(lName);
        businessCustomer.setTel(tel);
        businessCustomer.setEmail(email);
        businessCustomer.setCustomerType("BusinessCustomer");
        businessCustomer.setDiscountPercentage(0.90);
        businessCustomer.setBusinessCustomerTotalPrice(price1, price2, price3, price4);
        return businessCustomer.getBusinessCustomerTotalPrice();     
    };

    public static double makeMemberInstance() {
        memberShipCustomer.setFName(fName);
        memberShipCustomer.setLName(lName);
        memberShipCustomer.setTel(tel);
        memberShipCustomer.setEmail(email);
        memberShipCustomer.setCustomerType("MemberShipCustomer");
        memberShipCustomer.setDiscountPercentage(0.95);
        memberShipCustomer.setMemberShipCustomerTotalPrice(price1, price2, price3, price4);
        return memberShipCustomer.getMemberShipCustomerTotalPrice();     
    };

}
