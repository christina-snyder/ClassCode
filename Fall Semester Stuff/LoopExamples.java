public class LoopExamples {
   public static void main(String[] args){
   
      System.out.println(contains("hello", "lo"));
      int counter = 1;
      int stopNumber = 5;
      int sum = 0;
      while (counter <= stopNumber){
         sum += counter; // sum = sum + counter;
         counter++;
      }
      System.out.printf("Sum: %d, Counter: %d\n", sum, counter);

      int x = 1;
      int thing = 0;
      while (x % 4 != 0){
         if (x < 4){
            thing++;
         } else {
            x++;
         }
         x++;
      }
      System.out.printf("X: %d, thing: %d", x, thing);

      

      
      int n = 1279;
      sum = 0;
      while (n > 0){
         int digit = n % 10;
         sum += digit;
         n = n/10;
      }
      System.out.printf("n: %d, sum: %d\n", n, sum);
    
      System.out.println(count("hello", "l"));
    } //ends main method
    
    public static int count(String str1, String str2){
       int index = 0;
       int counter = 0;
       while (index < str1.length()){
         String letter = str1.substring(index, index + 1);
         if (letter.equals(str2)){
            counter++;
         }
         index++;
       }
       return counter;
    }
    
    public static boolean contains(String str1, String str2){
      if (str2.length() > str1.length()){
         return false;
      }
      
      for (int i = 0; i < str1.length() - (str2.length() - 1); i++)}
         String window = str1.substring(i, i + str2.length());
         if (window.equals(str2)){
            return true;
         }
      }
      return false;
    } //ends method
    
    public static int countTimesAppear(String str1, String str2){
       if (str2.length() > str1.length()){
         return 0;
      }
      int count = 0;
      for (int i = 0; i < str1.length() - (str2.length() - 1); i++)}
         String window = str1.substring(i, i + str2.length());
         if (window.equals(str2)){
            count++;
         }
      }
      return count;
    }
    
    public static boolean containsDoubleLetter(String str){
      for (int i = 0; i <str.length() - 1; i++){
         String fl = str.substring(i, i + 1);
         String sl = str.substring(i+1, i + 2);
         if (fl.equals(sl)){
            return true;
         }
      }//ends loop
      return false;
    } //ends method
    
    /*
         contains method or check for X method
         for (init; stop condition; increment){ 
            window?
            if (condition){
               return a boolean
            }
         }
         return other boolean
    */
    
    /*
      Counting or some acculumation like concatenating to a string
      initialize some return variable (count = 0, toReturn = "")
      for (init; stop condition; increment){
         if (condition){
            update our bucket variable
         }
      }
      return that bucket variable
    */
} //class