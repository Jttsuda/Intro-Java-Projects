// Program: Lab5.java
// Author: Jared Suda
// Last Modified: February 20, 2021
// Desc.: Getting User Input

import java.util.Scanner;

public class Lab5 {
   public static void main(String[] args) {
       Scanner Obj = new Scanner(System.in);
       System.out.print("Enter Max Number: ");
       int maxNum = Obj.nextInt();
       System.out.print("Enter Number of Spaces: ");
       int numOfSpaces = Obj.nextInt();
       
       printColumns(maxNum, numOfSpaces);
       System.out.println();
       
       System.out.println("Enter 3 Integers");
       int a = Obj.nextInt();
       int b = Obj.nextInt();
       int c = Obj.nextInt();

       double result = average3(a, b, c);
       System.out.print("Average: " + result);
   }
   
   public static void printColumns(int maxNum, int numOfSpaces) {
      for (int i = 1; i <= maxNum; i++){
         System.out.print(i);
         for (int x = 1; x <= numOfSpaces; x++) {
            if (i < maxNum) {
               System.out.print(" ");
            }
         }
      }
   }
   
   public static double average3(int numA, int numB, int numC) {
      return (numA + numB + numC) / 3.0;
   }


}
