import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FancyRectangleViewer {
   public static void main(String[] args){
      JFrame frame = new JFrame();
      int width = 500;
      int height = 500;
      frame.setSize(width, height);
      frame.setTitle("Fancy Rectangle!");
      
      FancyRectangle comp = new FancyRectangle();
      
      class RectListener implements MouseListener {
         public void mouseExited(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            comp.setXY1(x, y);
         }
         public void mouseReleased(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            comp.setXY2(x, y);
            comp.repaint();
         }
         public void mouseClicked(MouseEvent e) {}
      }
      
      RectListener listener = new RectListener();
       comp.addMouseListener(listener);
       
       frame.add(comp);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}