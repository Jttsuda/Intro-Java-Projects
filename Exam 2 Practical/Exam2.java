// Program: Exam2.java
// Author: Jared Suda
// Last Modified: April 30, 2021
// Desc.: Exam 2 Practical

import java.io.*;
import java.util.*;

public class Exam2 {
   public static void main(String[] args) throws FileNotFoundException {
      printTriangleType(5, 7, 7);
      printTriangleType(6, 6, 6);
      printTriangleType(5, 7, 8);
      printTriangleType(2, 18, 2);

      Scanner in = new Scanner(new File("inputFile.txt"));
      PrintStream out = new PrintStream(new File("outputFile.txt"));
      doubleSpace(in, out);
   }
   
   public static void printTriangleType(int a, int b, int c) {
      if (a == b && b == c) {
         System.out.println("Equilateral");
      } else if (a == b || b == c || a == c) {
         System.out.println("Isosceles");
      } else {
         System.out.println("Scalene");
      }
   }
   
   public static void doubleSpace(Scanner input, PrintStream out) {
      String output = "";
         while (input.hasNextLine()) {
            output += input.nextLine() + "\n\n";
         }
         input.close();
         out.print(output);
         input.close();
         out.close();
   }
}