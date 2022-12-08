import java.util.Scanner;
public class GuessingGame {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int magicNumber = 8; //the number we're trying to guess
      System.out.print("Welcome to the guessing game! Please pick a number 1-10: ");
      int guess = Integer.parseInt(scan.nextLine());

      boolean result = checkAnswer(magicNumber, guess);
      
      if (guess != magicNumber){
         System.out.print("Please pick a number 1-10: ");
         guess = Integer.parseInt(scan.nextLine());
         result = checkAnswer(magicNumber, guess);
      }
      
      if (!result){
         System.out.print("Please pick a number 1-10: ");
         guess = Integer.parseInt(scan.nextLine());
         result = checkAnswer(magicNumber, guess);
      }
      
      if (!result){
         System.out.println("Sorry man, you lost- 3 chances are all gone");
      }
   }//closing for main method
   
   public static boolean checkAnswer(int answer, int guess){
      String youWin = "Congrats! You won the game- that's the number!";
      String tooHigh = "Your number is too high, guess again";
      String tooLow = "Your number is too low, guess again";
         if (guess == answer){
         System.out.println(youWin);
         return true;
         } else if (guess < answer){
            System.out.println(tooLow);
            return false;
          }else if (guess > answer){
            System.out.println(tooHigh);
            return false;
        } 
        return false;
   }
   
}//closing for class