// Program: Lab6.java
// Author: Jared Suda
// Last Modified: March 4, 2021
// Desc.: Using GUI Library
import java.awt.*;

public class Lab6 {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(300, 200);
      panel.setBackground(Color.CYAN);

      Graphics g = panel.getGraphics();
      g.drawLine(50, 50, 150, 150);
      g.setColor(Color.RED);

      for (int i = 0; i < 5; i++){
         g.drawRect(50, 50, 20 + (i*20), 20 + (i*20));
      }

   }
}
