import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Name: ");
        String name = myObj.nextLine();
        
        System.out.println("Salary: ");
        float salary = myObj.nextInt();

        System.out.println("Tax: ");
        int tax = myObj.nextInt();
        float grossSalary = salary * (100-tax)/100;
        System.out.println(name + " your salary is " + salary + " euros.");
        System.out.println("And after taxes your gross salary is: " + grossSalary);
        myObj.close();
    
    }
}
