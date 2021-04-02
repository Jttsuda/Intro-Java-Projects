// Program: Lab10.java
// Author: Jared Suda
// Last Modified: April 2, 2021
// Desc.: Working with Arrays

public class Lab10 {
   public static void main(String[] args) {
      String[] daynames2 = {"Mon", "Tue", "Sun", "Wed", "Thu", "Sun", "Fri", "Sat", "Sun"};
      int count = 0;
      for (int i = 0; i < daynames2.length; i++) {
         if (daynames2[i] == "Sun") {
            count += 1;
            daynames2[i] = "Holiday";
         }
      }
      
      System.out.println("Occurences: " + count);
   }
}
