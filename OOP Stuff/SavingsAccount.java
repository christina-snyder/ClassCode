public class SavingsAccount extends BankAccount{
   private double interestRate;
   private int maxNumWD, currNumWD;
   
   public SavingsAccount(double interestRate){
      super(200); //gotta be first
      this.interestRate = interestRate;
      //balance = 200; balance is private in BankAccount
      maxNumWD = 5;
      currNumWD = 0;
   }
   
   public void withdraw(double amt){
      if (currNumWD < maxNumWD){
         currNumWD++;
         super.withdraw(amt);
      } else {
         System.out.println("You've reached the limit of WD for this month.");
      }
   }
   
   public void applyInterest(){
      double currBalance = getBalance();
      double amt2Add = currBalance * interestRate;
      //currBalance += amt2Add; doesn't change instance variable
      deposit(amt2Add);
   }
}