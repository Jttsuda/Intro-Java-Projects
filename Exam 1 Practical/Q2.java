// Program: Q2.java
// Author: Jared Suda
// Last Modified: February 26, 2021
// Desc.: Exam 1 Question 2

public class Q2 {
   public static void main(String[] args) {
      printMultiples(3, 5);
      printMultiples(7, 3);
   }
   
   
   public static void printMultiples (int n, int m) {
      for(int i = 1; i <= m; i++) {
         System.out.print(n * i);
         if(i < m) {
            System.out.print(", ");
         }
      }
      System.out.println();
   }
   
   
}
