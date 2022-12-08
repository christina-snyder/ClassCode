public class NestedLoops {
   public static void main(String[] args){
      for (int i = 0; i<5; i++){
         for (int j = 0; j < i; j ++){
            System.out.printf("*");
         } //ends inner for loop
         System.out.println();
      } //ends outer for loop
   
   
   for (int i = 1; i <= 6; i++){
      for (int j = 1; j <= 6; j++){
         System.out.print(i * j + ", ");
      } //inner loop
      System.out.println();
   } //outer loop
   } //ends main method
}