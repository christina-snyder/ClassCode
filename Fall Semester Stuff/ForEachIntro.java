public class ForEachIntro {
   public static void main(String[] args){
      /*
         for (int i = 0; i <arr.length; i++){
            dataType element = arr[i];
         }
      */
      
      /*
         for (dataType element : arr)
      */
      int[] numbers = {7, 5, 3, 1};
      printArray(numbers);
   }
   
   public static int findMax(int[] arr){
      int max = arr[0];
      for (int thing : arr){
         if (thing > max){
            max = thing;
         }
      }
      return max;
   }
   
   public static void printArray(int[] arr){
      for (int element : arr){
         System.out.print(element + ", ");
      }
      System.out.println();
   }  
}