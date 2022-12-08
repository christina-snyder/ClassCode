public class BankAccountTester{
   public static void main(String[] args){
      System.out.println("GAN Before creation: " + BankAccount.globalAccountNumber);
      BankAccount b1 = new BankAccount();
      b1.deposit(200);
      b1.withdraw(20);
      System.out.println(b1);
      System.out.println("GAN After creation: " + BankAccount.globalAccountNumber);
      System.out.println("B1's Account Number: " + b1.getAccountNumber());
      
     BankAccount b2 = new BankAccount();
      System.out.println("GAN After creation 2: " + BankAccount.globalAccountNumber);
      System.out.println("B2's Account Number: " + b2.getAccountNumber());
      System.out.println(b2.globalAccountNumber);
      
      System.out.println(Circle.getArea(1));
      System.out.println(Circle.getCirc(1));
      
      SavingsAccount s1 = new SavingsAccount(.002);
      s1.deposit(20);
      s1.applyInterest();
      s1.withdraw(10);
      s1.withdraw(10);
      s1.withdraw(10);
      s1.withdraw(10);
      s1.withdraw(10);
      s1.withdraw(10);
      System.out.println(s1);

      BankAccount account = new SavingsAccount(.005);
      account.deposit(20);
      //account.applyInterest();
      account.withdraw(10);
      account.withdraw(10);
      account.withdraw(10);
      account.withdraw(10);
      account.withdraw(10);
      account.withdraw(10);
      System.out.println("Savings As Bank: " + account);
      
      /*SavingAccount account2 = new BankAccount();
      account2.applyInterest*/
   }
}