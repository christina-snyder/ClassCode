import java.awt.*;
import javax.swing.*;
public class GridComponent extends JComponent {
   private Rectangle[][] grid;
   
   public GridComponent(){
      grid = new Rectangle[6][6];
      
      for (int i = 0; i < grid.length; i++){
         for (int j = 0; j <grid[0].length; j++){
            grid[i][j] = new Rectangle(i * 15, j * 15, 15, 15);
         }
      }
   }
   

   
   public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
      int y = 0;
      for (Rectangle[] gridRow : grid){
         int allRed = 0;
         int allGreen = 0;
         int allBlue = 0;
         for (Rectangle rect : gridRow){
            g2.setColor(new Color( (int) (Math.random() * 256), (int) (Math.random() * 256),(int) (Math.random() * 256)));
            allRed += g2.getColor().getRed();
            allGreen += g2.getColor().getGreen();
            allBlue += g2.getColor().getBlue();
            g2.fill(rect);
         }
         allRed /= 6;
         allGreen /= 6;
         allBlue /= 6;
         g2.setColor(new Color(allRed, allGreen, allBlue));
         g2.fill(new Rectangle(90, y, 15, 15));
         y += 15;
      }
   }
}