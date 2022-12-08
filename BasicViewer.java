import javax.swing.*;
import java.awt.event.*;
public class BasicViewer {
   public static void main(String[] args){
      //5 Lines just to start
      JFrame frame = new JFrame();
      //frame.setSize(width, height); //dimensions are in pixels
      int width = 300;
      int height = 400;
      frame.setSize(width, height);
      frame.setTitle("First frame!");
      //BasicComponent component = new BasicComponent();
      CarComponent component = new CarComponent(100, 100);
      frame.add(component);
      
      class MyMouseListener implements MouseListener {
         public void mouseExited(MouseEvent e) {
            int xValue = e.getX();
            int yValue = e.getY();
            if (xValue >= width){
               xValue = width;
               component.setXY(xValue - 60, yValue - 15);
            }
            if (yValue >= height - 22){
               yValue = height - 22;
               component.setXY(xValue - 30, yValue - 30);
            }
            if (xValue <= 0){
               xValue = 0;
               component.setXY(xValue, yValue - 15);
            }
            if (yValue <= 0){
               yValue = 0;
               component.setXY(xValue - 30, yValue);
            }
            System.out.printf("(%d,%d)\n", xValue, yValue);
            component.repaint();
         }
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {
            int xValue = e.getX();
            int yValue = e.getY();
            System.out.printf("(%d,%d)\n", xValue, yValue);
            component.setXY(xValue - 30, yValue - 15);
            component.repaint();
         }
         public void mouseReleased(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {System.out.println("I was clicked!");}
      }
      
      class AnimationListener implements ActionListener {
         int dx, dy;
         
         public AnimationListener(){
            dx = 1;
            dy = -1;
         }
         public void actionPerformed(ActionEvent e){
            if (component.myGetX() + component.myGetWidth() >= width){ //right wall
               dx = -dx;
               component.changeColor();
            } else if (component.myGetX() <= 0){ //left wall
               dx = -dx;
               component.changeColor();
            } else if (component.myGetY() <= 0) { //top wall
               dy = - dy;
               component.changeColor();
            } else if (component.myGetY() + component.myGetHeight() >= height - 22){
               dy = -dy;
               component.changeColor();
            }
            //component.changeColor(); //too trippy
            component.translate(dx, dy);
            component.repaint();
         }
      }
      
      MyMouseListener listener = new MyMouseListener();
      //component.addMouseListener(listener);
      Timer t = new Timer(20, new AnimationListener());
      t.start();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}