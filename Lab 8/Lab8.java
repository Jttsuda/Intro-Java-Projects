// Program: Lab8.java
// Author: Jared Suda
// Last Modified: March 5, 2021
// Desc.: RNG X's

public class Lab8 {
   public static void main(String[] args) {
      for(int i = 0; i < rng(9, 2); i++) {
         for(int x = 0; x < rng(16, 5); x++) {
            System.out.print("x");
         }
         System.out.println();
      }
   }

   public static int rng(int range, int min) {
      int rand = (int)(Math.random() * range) + min;
      return rand;
   }

}
