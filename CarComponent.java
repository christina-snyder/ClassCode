import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class CarComponent extends JComponent {
   private int x;
   private int y;
   private Color bodyColor;
   
   public CarComponent(int x, int y){
      this.x = x;
      this.y = y;
      bodyColor = new Color(150, 72, 196);
   }
   
   public void changeColor(){
      int r = (int) (Math.random() * 256);
      int g = (int) (Math.random() * 256);
      int b = (int) (Math.random() * 256);
      bodyColor = new Color(r, g, b);
   }
   
   public void translate(int dx, int dy){
      x += dx;
      y  += dy;
   }
   
   public int myGetX(){
      return x;
   }
   
   public int myGetY(){
      return y;
   }
   
   public int myGetHeight(){
      return 30;
   }
   
   public int myGetWidth(){
      return 60;
   }
   
   public void setXY(int newX,  int newY){
      x = newX;
      y = newY;
   }
   
   public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
      

      
      Rectangle body = new Rectangle(x + 0, y + 10, 60, 10);
      
      Line2D.Double frontWind = new Line2D.Double(x + 40, y + 0, x + 50, y + 10);
      Line2D.Double rearWind = new Line2D.Double(x + 20, y + 0, x + 10, y + 10);
      Line2D.Double top = new Line2D.Double(x + 20, y + 0, x + 40, y + 0);
      
      Ellipse2D.Double frontWheel = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
      Ellipse2D.Double rearWheel = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
      
      g2.setColor(bodyColor);
      g2.fill(body);
      g2.setColor(Color.BLACK);
      g2.draw(frontWind);
      g2.draw(rearWind);
      g2.draw(top);
      g2.draw(frontWheel);
      g2.draw(rearWheel);
   }
}