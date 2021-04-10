// Program: TestNameClass.java
// Author: Jared Suda
// Last Modified: April 2, 2021
// Desc.: Working with Classes

public class TestNameClass {
   public static void main(String args[]) {
      Name n1 = new Name("James", "M.", "Bond");
      Name n2 = new Name("Rebecca", "J.", "Smith");
      
      System.out.println(n1);
      System.out.println(n2);
      
      System.out.println(n1.getNormalOrder());
      System.out.println(n2.getReverseOrder());
      
      n1.setFirstName("Jenny");
      n1.setMiddleName("L.");
      n1.setLastName("Lopez");
      
      System.out.println(n1.getFirstName() + " " + n1.getMiddleName() 
                           + " " + n1.getLastName());
                 
      System.out.println(n2.getFirstName() + " " + n2.getMiddleName() 
                           + " " + n2.getLastName());
   }
}