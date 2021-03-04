// Program: Lab6.java
// Author: Jared Suda
// Last Modified: March 4, 2021
// Desc.: Using GUI Library
import java.awt.*;

public class Lab6 {
  public static void main(String[] args) {
   DrawingPanel panel = new DrawingPanel(300, 200);
   Graphics g = panel.getGraphics();
   panel.setBackground(Color.CYAN);
   g.setColor(Color.RED);
   
    for (int i = 0; i < 5; i++){
      g.drawRect(50, 50, 20 + (i*20), 20 + (i*20));
    }
    
    g.setColor(Color.BLACK);
    g.drawLine(50, 50, 150, 150);
    
  }
}