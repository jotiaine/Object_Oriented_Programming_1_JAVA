package practise.week_2.packages.src.package2;

import practise.week_2.packages.src.package1.Access1;

public class Access3 {
  public static void main(String[] args) {
    Access1 a1 = new Access1();

    // Testing default attributes
    System.out.println(a1.hours);
    System.out.println(a1.minutes);

    // Testing public attributes
    System.out.println(a1.days);
    System.out.println(a1.months);

    // Testing private attributes
    // System.out.println(a1.years); -> years is not visible
    // System.out.println(a1.decades); -> decades is not visible
    System.out.println(a1.getYears()); // with a public method it is accessible
    System.out.println(a1.getDecades()); // with a public method it is accessible

    // Testing protected attributes
    System.out.println(a1.centuries); // protected attributes are accessible from the object
    System.out.println(a1.weeks); // protected attributes are accessible from the object
    // In the same package, protected attributes are accessible from the object
  }
}
