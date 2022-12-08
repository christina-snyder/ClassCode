public class CashRegisterTester{
   public static void main(String[] args){
      //1. Create your object
      CashRegister cashMoney = new CashRegister(.10);
      //2. Call some methods
      cashMoney.addItem(.50, 2); //bananas
      cashMoney.addItem(.75, 3); //apples
      System.out.println(cashMoney);
      double sT = cashMoney.getSubTotal();
      int items = cashMoney.getNumItems();
      //3. Print expected results
      System.out.println("The subtotal should be $3.25");
      System.out.println("We should have 5 items");
      //4. Print actual results
      System.out.println("The subtotal is: $" + sT);
      System.out.println("We have " + items + " items");
      System.out.println("The total with tax is: " + cashMoney.getTotalWithTax());
      
      double change = cashMoney.calculateChange(5.00);
      System.out.println("The change should be $1.42 and is $" + change);
      
      cashMoney.reset();
      System.out.println("Our subtotal after the reset should be zero and is: $" + cashMoney.getSubTotal());
      System.out.println("Our subtotal after the reset should be zero and is: $" + sT);
      //System.out.printf("$.2f", amount);
      System.out.println(cashMoney);
      
      CashRegister c1 = new CashRegister();
      CashRegister c2 = c1;
      c2.addItem(3.00, 1);
      System.out.println(c1.getSubTotal());
      
      int[] arr = {7, 3, 5, 1};
      for (int x : arr){
         x += 2;
      }
      
      CashRegister[] carr = {cashMoney, c1};
      carr[0].getSubTotal();
      for (CashRegister c : carr){
         c.addItem(2, 5);
      }  
   }
}