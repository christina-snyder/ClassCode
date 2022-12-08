public class MeasurableTester {
   public static void main(String[] args){
      Measurable m = new BankAccount();
      Measurable m2 = new Menu("Wendys");
      
      System.out.println(m.getMeasure());
      
      System.out.println(m2.getMeasure());
   }
}