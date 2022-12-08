import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class FancyRectangle extends JComponent {
   private int x1, x2, y1, y2;
   private ArrayList<Rectangle> shapes;
   
   public FancyRectangle(){
      x1 = 0;
      x2 = 0;
      y1 = 0;
      y2 = 0;
      shapes = new ArrayList<Rectangle>();
   }
   
   public void setXY1(int x, int y){
      x1 = x;
      y1 = y;
   }
   
     public void setXY2(int x, int y){
      x2 = x;
      y2 = y;
   }
   
   public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
      int topX = 0, topY = 0, width = 0, height = 0;
      if (x2 > x1){
         if (y1 < y2){
            //drag down to the right
            topX = x1;
            topY = y1;
            width = x2 - x1;
            height = y2 - y1;
         } else {
            //draggin up to the right
            topX = x1;
            topY = y2;
            width = x2 - x1;
            height = y1 - y2;
         }
      } else {
         if (y1 < y2){
            //dragging down to the left
            topX = x2;
            topY = y1;
            width = x1 - x2;
            height = y2 - y1;
         } else {
            //dragging up to the left
            topX = x2;
            topY = y2;
            width = x1 - x2;
            height = y1 - y2;
         }
      }
      
      Rectangle rect = new Rectangle(topX, topY, width, height);
      shapes.add(rect);
      
      for (Rectangle r : shapes){
         int red = (int) (Math.random() * 256);
         int green = (int) (Math.random() * 256);
         int blue = (int)( Math.random() * 256);
         Color color = new Color(red, green, blue);
      
         g2.setColor(color);
         g2.fill(r);
      }
      

   }
}