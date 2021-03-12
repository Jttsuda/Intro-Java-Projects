// Program: Lab7.java
// Author: Jared Suda
// Last Modified: March 4, 2021
// Desc.: Taxes

public class Lab7 {
   public static void main(String[] args) {
      System.out.println("The tax on $50000 is " + tax(50000));    // 9237.5
      System.out.println("The tax on $27500 is " + tax(27500));    // 3767.5
      System.out.println("The tax on $6000 is " + tax(6000));      // 600.0
      System.out.println("The tax on $120000 is " + tax(120000));  // 28227.0
   }

   public static double tax(int salary) {
      double federalTaxes;
      if (salary <= 7150) {
         federalTaxes = salary * 0.1;
      } else if (salary <= 29050) {
         federalTaxes = 715 + 0.15 * (salary - 7150);
      } else if (salary <= 70350) {
         federalTaxes = 4000 + 0.25 * (salary - 29050);
      } else {
         federalTaxes = 14325 + 0.28 * (salary - 70350);
      }
      return federalTaxes;
   }

}
