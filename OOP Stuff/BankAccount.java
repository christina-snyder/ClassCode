public class BankAccount implements Measurable, Comparable<BankAccount>{
   public static int globalAccountNumber = 10000;

   private double balance;
   private int accountNumber;
   
   public BankAccount(){
      balance = 0;
      accountNumber = globalAccountNumber;
      globalAccountNumber++;
   }
   
   /*public int compareTo(Object other){
      BankAccount otherAccount = (BankAccount) other;
      return (int) (this.balance - otherAccount.balance);
   }*/
   
   public int compareTo(BankAccount other){
      return (int) (this.balance - other.balance);
   }
   
   public BankAccount(double initialBalance){
      balance = initialBalance;
      accountNumber = globalAccountNumber;
      globalAccountNumber++;
   }
   
   public int getAccountNumber(){
      return accountNumber;
   }
   
   public void deposit(double amt){
      balance += amt;
   }
   
   public void withdraw(double amt){
      if (amt > balance){
         System.out.println("ERROR: NOT ENOUGH MONEY");
         return;
      }
      balance -= amt;
   }
   
   public double getBalance(){
      return balance;
   }
   
   public String toString(){
      return "This account's balance is $" + String.format("%.2f", balance);
   }
   
   public int getMeasure(){
      return (int) balance;
   }
}