public class CashRegister {
   //Instance Variables
   private double subTotal;
   private int numItems;
   private double salesTax;
   
   //Constructors
   //OverLoaded Constructor
   public CashRegister (double salesTax){
      subTotal = 0;
      numItems = 0;
      //instanceVariable = parameterVariable
      this.salesTax = salesTax;
      salesTax = 50; //does not change instance variable, only parameter variable
      //the "this" is a self-reference
   }
   
   public CashRegister(){
      subTotal = 0;
      numItems = 0;
      salesTax = 0.08;
   }
   
   //Methods
   public double getSubTotal(){
      return subTotal;
   }
   
   public int getNumItems(){
      return numItems;
   }
   
   public double getSalesTax(){
      return salesTax;
   }
   
   public void addItem(double price, int quantity){
      numItems += quantity;
      subTotal += (price * quantity);
   }
   
   public void reset(){
      subTotal = 0;
      numItems = 0;
   }
   
   public double getTotalWithTax(){
      //return subTotal * (1 + salesTax);
      double tax = subTotal * salesTax;
      double total = subTotal + tax;
      //how to round to 100ths place
      total = Math.round(total * 100);
      total /= 100;
      return total;
   }
   
   public double calculateChange(double amtGiven){
      double total = this.getTotalWithTax();
      //when I don't have an implicit parameter, the "this" is implied
      return amtGiven - total;
   }
   
   //Over Ridden Method
   public String toString(){
      return "Our cashRegister has " + numItems + " items for a subtotal of $" + subTotal;
   }
   
}