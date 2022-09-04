import java.util.Scanner;
import java.util.ArrayList;

public class MainCashier {
    // Variables
     static Scanner input;
     static Customer customer;
     static BusinessCustomer businessCustomer;
     static MemberShipCustomer memberShipCustomer;
     static ArrayList<Double> prices = new ArrayList<Double>();
     static String reply;
     static String fName;
     static String lName;
     static String tel;
     static String email;
     static double amountOfPurchases;
     static int customerType;
     static int memberShipNumber;
     static double discount;
     static double totalSum;
     static String companyName;


    public static void main(String[] args) {
    try {
    
        // Input
        input = new Scanner(System.in);
        System.out.println("Welcome to the cashier program!");

        // Instances
        customer = new Customer();
        businessCustomer = new BusinessCustomer();
        memberShipCustomer = new MemberShipCustomer();

        
        repeatProgram();


    } catch (Exception e) {
            System.out.println("Error " + e.getMessage());        
        }

        
    }
    
    public static void addNewPurchase() {
        System.out.println("Do you want to give another product prize? (y/n)");
        reply = input.next();
    }
   
    public static void addNewCustomerInfomation() {
        System.out.println("Give customer information:");
        System.out.print("Firstname: ");
        fName = input.next();
        System.out.print("Lastname: ");
        lName = input.next();
        System.out.print("Phone: ");
        tel = input.next();
        System.out.print("Email: ");
        email = input.next();
    }

    public static void calculateTotalSum () {
        System.out.println("Total Sum: " + totalSum);
        
    }

    public static void repeatProgram() {
        do {
            // System.out.println(prices);
            System.out.println("Give the price for the product:");
            prices.add(input.nextDouble());
    
            addNewPurchase();
            
            if(reply.equals("y")) {
                repeatProgram();
            } else if (reply.equals("n")) {
                addNewCustomerInfomation();
                
                for (double price : prices) {
                    amountOfPurchases += price;
                }

                int amountInt = getAmountinInt(amountOfPurchases);
                
                amountOfPurchases = amountOfPurchases;
                System.out.println("Amount of purchase: " + amountInt);
        
                System.out.println("Select customer type: 1) Business customer 2) Membership customer 3) regular customer");
                customerType = input.nextInt();

                if(customerType == 1) {
                    discount = 0.90;
                    System.out.print("Give company name: ");
                    companyName = input.next();
                    businessCustomer.setCompanyDiscount(discount);
                    businessCustomer.setCompanyName(companyName);

                    totalSum = amountOfPurchases * discount;
                    // print discount
                    discount = (int)10;
                    System.out.println("Business customer discount: " + discount + "%" + " The total sum to pay: " + Math.round(totalSum * 100) / 100.0);
                    
                } else if (customerType == 2) {
                    discount = 0.95;
                    System.out.print("Give membership number: ");
                    memberShipNumber = input.nextInt();
                    memberShipCustomer.setMemberShipNumber(memberShipNumber);
                    memberShipCustomer.setMemberShipDiscount(discount);
                    totalSum = amountOfPurchases * discount;

                    // print discount
                    discount = (int)5;
                    System.out.println("Membership customer discount: " + discount + "%" + " The total sum to pay: " + Math.round(totalSum * 100) / 100.0);
                } else if (customerType == 3) {
                    discount = (int)0;
                    totalSum = amountOfPurchases;
                    System.out.println("Normal customer discount: " + discount + "%" + " The total sum to pay: " + Math.round(totalSum * 100) / 100.0);

                }
        
        
                
        
        
                System.out.println("Do you want to add a new customer? 1) yes 2) no");
                reply = input.next();
        
                if(reply.toLowerCase().equals("yes")) {
                    repeatProgram();
                } else if (reply.toLowerCase().equals("no")) {
                    System.out.println("App close");
                    break;
                } else {
                    System.out.println("Invalid input!");
                    break;
                }
            } else {
                System.out.println("Invalid input!");
            }
            
            
        }
        while(!reply.equals("no"));
    }


    public static int getAmountinInt(double amountOfPurchases) {
        return (int) amountOfPurchases;
    }
   

}
