// Program: NestedLoops.java
// Author: Jared Suda
// Last Modified: February 12, 2021
// Desc.: Nested For Loops


public class NestedLoops {
   public static void main(String[] args) {
      printStars(5);
      System.out.println();
      printNumbers(7);
   }
   
   
   public static void printStars(int numberOfLines) {
      for (int i = 1; i <= numberOfLines; i++){
         for (int x = 1; x <= i; x++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
   
   public static void printNumbers(int numOfLines) {
      for (int i = 1; i <= numOfLines; i++){
         for (int x = 1; x <= i; x++) {
            System.out.print(i);
         }
         System.out.println();
      }
   }


}
