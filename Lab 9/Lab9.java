// Program: Lab9.java
// Author: Jared Suda
// Last Modified: March 17, 2021
// Desc.: Reading and Writing to a File

import java.io.*;
import java.util.Scanner;

public class Lab9 {
   public static void main(String[] args) {
      try {
         Scanner reader = new Scanner(new File("romeo_and_juliet.txt"));
         int count = 0;
         while (reader.hasNextLine()) {
            String data = reader.nextLine();
            count += 1;
            if (count >= 709 && count <= 714) {
               writeToFile(data);
            }
         }
         reader.close();
      } 
      catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
  
   public static void writeToFile(String data) {
      File output = new File("output.txt");
      try {
         FileWriter writer = new FileWriter("output.txt", true);
         writer.write(data + "\n");      
         writer.close();
      } 
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
  
  
}
