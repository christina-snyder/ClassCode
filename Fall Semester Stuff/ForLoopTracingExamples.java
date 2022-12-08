public class ForLoopTracingExamples {
   public static void main(String[] args){
      System.out.println("---Question 01---");
      for (int i = 0; i < 5; i++){
         System.out.print(i + ", " );
      }
      System.out.println();
      System.out.println();
      
      System.out.println("---Question 02---");
      for (int i = 5; i >= 0; i--){
         System.out.print(i + ", ");
      }
      System.out.println();
      System.out.println();
      
      System.out.println("---Question 03---");
      for (int i = 0; i < 9; i = i + 2){
         System.out.print(i + ", ");
      }
      System.out.println();
      System.out.println();
      /*
      System.out.println("---Question 04---");
      for (int i = 0; i != 9; i = i + 2){
         System.out.print(i + ", ");
      }
      System.out.println();
      System.out.println();
      */
     
      System.out.println("---Question 05---");
      for (int i = 1; i <= 20; i = i * 2){
         System.out.print(i + ", ");
      }
      System.out.println();
      System.out.println();
      
   }
}