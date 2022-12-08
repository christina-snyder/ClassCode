public class ArrayIntro {
   public static void main(String[] args){
      int[] arr = {7, 5,        3,         1};
      int value = arr[2];
      String[] arr2 = {"abc", "hello", "hi"};
      int len = arr.length;
      System.out.println(len);
      System.out.println(arr);
      printArray(arr);
      arr[1] = 15;
      printArray(arr);
      int[] squares = new int[10];
      //dataType[] arrName = new dataType[size];
      printArray(squares);
      for (int i = 0; i<squares.length; i++){
         int value = i * i;
         squares[i] = value;
      }
      printArray(squares);
      System.out.println(addUp(arr));
      System.out.println(average(arr));
   } //end main
   
   public static void printArray(int[] arr){
      for (int i = 0; i < arr.length; i++){
         int element = arr[i];
         System.out.print(element + ", ");
      }//ends loop
      System.out.println(); //go down to next line
   } //ends method

   
   public static double average(int[] puppy){
      int sum = addUp(puppy);
      double len = puppy.length;
      return sum/len;
   }
   
   public static int addUp(int[] fish){
      int total = 0;
      for (int i = 0; i<fish.length; i++){
         int element = fish[i];
         total += element;
      }
      return total;
   }
}//ends class