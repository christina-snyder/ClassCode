import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class BasicComponent extends JComponent {
   public void paintComponent(Graphics g){
      Graphics2D g2  = (Graphics2D) g;
      //g2.drawLine(x1, y1, x2, y2);
      g2.setColor(Color.BLUE);
      g2.drawLine(10, 10, 50, 50);
      //Rectangle rect = new Rectangle(x, y, width, height)
      Rectangle rect = new Rectangle(290, 50, 20, 30);
      g2.fill(rect);
      
      rect.translate(-50, 50);
      g2.draw(rect);
      
      Ellipse2D.Double ellipse = new Ellipse2D.Double(200, 150, 50, 25);
      g2.draw(ellipse);
      
      Line2D.Double line = new Line2D.Double(50, 50, 100, 100);
      g2.setColor(Color.MAGENTA);
      g2.draw(line);
      
      Point2D.Double from = new Point2D.Double(100, 100);
      Point2D.Double to = new Point2D.Double(10, 100);
      Line2D.Double line2 = new Line2D.Double(from, to);
      g2.setColor(Color.GREEN);
      g2.draw(line2);
   }
}