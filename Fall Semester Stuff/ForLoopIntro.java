public class ForLoopIntro {
   public static void main(String[] args){
   /*
      while (condition) {
         doStuff;
      }
      
      initialize some loop variable
      while (condition on that variable) {
         doStuff;
         update loop variable
      }
      
      int index = 0;
      while (index < str.length()){
         index++;
      }
   */
   
   /*
      for (initialization ; condition ; updating ) {
         doStuff;
      }
      
      for (int index = 0; index < str.length(); index++){
         doStuff;
      }
   */
   
      for (int x = 1; x <= 10; x++){
         System.out.println(x);
      }  
      //System.out.println(x); loop variables only exist in the context of a loop
      
      String str = "hello";
      for (int index = str.length() - 1; index >= 0; index--){
         String letter = str.substring(index, index + 1);
         System.out.println(letter);
      }
      
      int product = 1;
      for (int number = 20; number > 0; number--){
         product = product * number;
      }
      System.out.println(product);
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Math.pow(2, 31) - 1);
   }
}