// Program: StarFigures.java
// Author: Jared Suda
// Last Modified: January 29, 2021
// Desc.: Using Static Methods

public class StarFigures {
   public static void main(String[] args) {
      twoRows();
      drawX();
      System.out.println();
      twoRows();
      drawX();
      twoRows();
      System.out.println();
      drawColumn();
      twoRows();
      drawX();
   }
   
   public static void twoRows () {
      System.out.println("*****\n*****");
   }
   
   public static void drawX () {
      System.out.println(" * *");
      System.out.println("  * ");
      System.out.println(" * *");
   }
   
   public static void drawColumn () {
      System.out.println("  *\n  *\n  *");
   }
}
