import javax.swing.*;
import java.awt.event.*;
public class TimerIntro {
   public static void main(String[] args){
      class MyTimerListener implements ActionListener {
         public void actionPerformed(ActionEvent e){
            System.out.println("Hello World!");
         }
      }
      
      class CountDownListener implements ActionListener {
         int seconds;
         boolean hasPrinted;
         
         public CountDownListener(int seconds){
            this.seconds = seconds;
            hasPrinted = false;
         }
         
         public void actionPerformed(ActionEvent e){
            if (seconds > 0) {
               System.out.println(seconds);
               seconds--;
            } else {
               if (!hasPrinted){
                  System.out.println("time's up!");
                  hasPrinted = true;
               }
            }  
         }
      }
      
      //Timer t = new Timer(interval, listener); //interval is in milliseconds
      MyTimerListener listener = new MyTimerListener();
      CountDownListener countListener = new CountDownListener(5);
      Timer t = new Timer(1000, countListener);
      t.start();
   }
}