// Program: Exam2.java
// Author: Jared Suda
// Last Modified: April 30, 2021
// Desc.: Exam 2 Practical

public class Exam2 {
   public static void main(String[] args) {
      printTriangleType(5, 7, 7);
      printTriangleType(6, 6, 6);
      printTriangleType(5, 7, 8);
      printTriangleType(2, 18, 2);


   }
   
   public static void printTriangleType(int a, int b, int c) {
       if (a == b && b == c) {
           System.out.println("Equilateral");
       } else if (a == b || b == c || a == c) {
           System.out.println("Isosceles");
       } else {fasdf
           System.out.println("Scalene");
       }
}
}