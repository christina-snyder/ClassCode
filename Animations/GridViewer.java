import javax.swing.*;
import java.awt.event.*;
public class GridViewer {
   public static void main(String[] args){
      //5 Lines just to start
      JFrame frame = new JFrame();
      //frame.setSize(width, height); //dimensions are in pixels
      int width = 300;
      int height = 400;
      frame.setSize(width, height);
      frame.setTitle("First frame!");
      //BasicComponent component = new BasicComponent();
      GridComponent component = new GridComponent();
      frame.add(component);
          
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}