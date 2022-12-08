import java.util.Scanner;
public class CashRegister {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = scan.nextLine();
      System.out.printf("Hello %s, Thanks for shopping\n", name);
      
      System.out.print("Please enter the amount you spent: $");
      String amount = scan.nextLine();
      System.out.println(amount);
      double cost = Double.parseDouble(amount);
      
      System.out.print("Please enter how much you're paying with: $");
      amount = scan.nextLine();
      double dollar = Double.parseDouble(amount);
      
      double totalChangeAmount = dollar - cost;
      System.out.printf("Your food costs $%.2f, You gave me $%.2f, I owe you $%.2f\n", cost, dollar, totalChangeAmount);
      
      //dividing by 20 and truncating will tell us how many 20s fit into the change amount
      int numTwenties = (int) (totalChangeAmount / 20);
      //We've got to figure out what's left after we take out all the 20s
      totalChangeAmount = totalChangeAmount % 20;
      
      int numTens = (int) (totalChangeAmount / 10);
      totalChangeAmount = totalChangeAmount - numTens * 10; // this is another way to calculate the remainder
      
      int numFives = (int) (totalChangeAmount / 5);
      totalChangeAmount %= 5; //this is the shorthand notation for tCA = tCA % 5;
    
      //whatever dollars are left will all be singles
      int dollarsBack = (int) totalChangeAmount;
      totalChangeAmount = totalChangeAmount - dollarsBack;
      
      //the line below changes from a portion of a dollar, to cents
      totalChangeAmount = totalChangeAmount * 100;
      

      final int CENTS_PER_QUARTER = 25;
      int numQuarters = (int) (totalChangeAmount / CENTS_PER_QUARTER);
      totalChangeAmount = totalChangeAmount - (CENTS_PER_QUARTER * numQuarters);
      //totalChangeAmount = totalChangeAmount % CENTS_PER_QUARTER
      final int CENTS_PER_DIME = 10;
      int numDimes = (int) (totalChangeAmount / CENTS_PER_DIME);
      totalChangeAmount -= numDimes * CENTS_PER_DIME;
      final int CENTS_PER_NICKEL = 5;
      int numNickels = (int) (totalChangeAmount / CENTS_PER_NICKEL);
      totalChangeAmount -= numNickels*CENTS_PER_NICKEL;
      //System.out.println(totalChangeAmount); // this print statement shows us that tCA is 0.9999999, not 1
      //so we need to round to 1 total penny
      int numPennies = (int) Math.round(totalChangeAmount);
      System.out.printf("I owe you %d twenties, %d tens, %d fives, and %d ones\n", numTwenties, numTens, numFives, dollarsBack);
      System.out.printf("I also owe you %d quarter(s), %d dime(s), %d nickels, and %d pennies", numQuarters, numDimes, numNickels, numPennies);
   }
}