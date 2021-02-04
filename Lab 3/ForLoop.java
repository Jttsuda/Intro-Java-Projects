// Program: ForLoop.java
// Author: Jared Suda
// Last Modified: February 4, 2021
// Desc.: Using For Loops and Variables


public class ForLoop {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){
      System.out.println(i*i);
    }
    
    System.out.println();
    double s0 = 1.52;
    double v0 = 1.12;
    double a = 1.63;
    double t = 1.734;
    double s = s0 + v0 * t + 0.5 * a * (t*t);
    System.out.println(s);
    
  }
}
