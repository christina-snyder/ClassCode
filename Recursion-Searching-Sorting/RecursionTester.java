import java.util.ArrayList;
public class RecursionTester {
   /* Pillars of Recursion
   1. Contains a terminating condition (Base Case)
   2. Approaches the terminating condition
   3. Calls itself
   */
   
   /*
   When coding recursively, we think:
   1. What is the simplest problem to solve?
   2. Pretend the function we're writing already works (like magic)
   */

   public static void main(String[] args){
      Triangle t = new Triangle(4);
      int area = t.getArea();
      System.out.println(area);
      System.out.println("4! = " + fact(4));
      System.out.println("-4! = " + fact(-4));
      
      System.out.println("racecar: " + isPal("racecar"));
      System.out.println("racekar: " + isPal("racekar"));
      System.out.println("racecat: " + isPal("racecat"));
      System.out.println("Racecar: " + isPal("Racecar"));
      System.out.println("racecar!: " + isPal("racecar!"));
      
      System.out.println(permute("academy"));
      //System.out.println(fibNumber(67));
      
      ToH(3, 1, 3, 2);
   }
   
   public static int multiply(int a, int b){
      if (a == 0 || b == 0){
         return 0;
      } else if (a == 1){
         return b;
      } else if (b == 1){
         return a;
      } else {
         
      }
   }
   
   public static void ToH(int numDisks, int currPeg, int destPeg, int unusedPeg){
      if (numDisks == 1) {
         System.out.println("Move from " + currPeg + " to " + destPeg);
      } else {
         ToH(numDisks - 1, currPeg, unusedPeg, destPeg);
         ToH(1, currPeg, destPeg, unusedPeg);
         ToH(numDisks - 1, unusedPeg, destPeg, currPeg);
      }
   }
   
   public static int fibNumber(int n){
      if (n == 0) return 0;
      else if (n == 1) return 1;
      else return fibNumber(n-1) + fibNumber(n-2);
   }
   
   public static ArrayList<String> permute(String str){
      ArrayList<String> toReturn = new ArrayList<String>();
      if (str.length() <= 1){
         toReturn.add(str);
         return toReturn;
      } else {
         for (int i = 0; i <str.length(); i++){
            String currLetter = str.substring(i, i+1);
            String before = str.substring(0, i);
            String after = str.substring(i + 1);
            ArrayList<String> littleOnes = permute(before + after);
            for (String littleString : littleOnes){
               String word = currLetter + littleString;
               toReturn.add(word);
            } // ends inner loop
         } //ends outer loop
         return toReturn;
      } //ends else
   }
   
   public static int fact(int number){
      if (number >= 0){
         return recFact(number);
      } else if (number < 0){
         int posNumber = -number;
         int result = recFact(posNumber);
         return -result;
      } else {
         return 0;
      }
   }
   
   private static int recFact(int number){
      if (number == 0){
         return 1;
      } else {
         return number * recFact(number - 1);
      }
   }
   
   public static boolean isPal(String str){
      str = str.toLowerCase();
      String toTest = "";
      for (int i = 0; i < str.length(); i++){
         char currLetter = str.charAt(i);
         if (currLetter >= 'a' && currLetter <= 'z'){ //means I am a letter
            toTest += currLetter;
         }
      }
      
      return recIsPal(toTest);
   }
   
   public static boolean recIsPal(String str){
      if (str.length() == 0 || str.length() == 1){
         return true;
      } else {
         String firstLetter = str.substring(0, 1);
         String lastLetter = str.substring(str.length() - 1);
         if (!firstLetter.equals(lastLetter)){
            return false;
         } else {
            //I know my first/last letter are the same
            String middle = str.substring(1, str.length() -1);
            return recIsPal(middle);
         }
      }
   }
}