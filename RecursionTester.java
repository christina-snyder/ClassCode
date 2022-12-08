public class RecursionTester {
   public static void main(String[] args){
      /*Triangle t1 = new Triangle(4);
      System.out.println(t1.findArea());*/
      
      System.out.println(pal("rac ecar"));
      System.out.println(pal("bat"));
      System.out.println(pal("Madam I'm Adam"));
      
   }
   
   public static boolean pal(String str){
      //data clean
      str = str.toLowerCase();
      String cleaned = "";
      for (int i = 0; i < str.length(); i++){
         char letter = str.charAt(i);
         if (letter >= 'a' && letter <= 'z'){
            cleaned += letter;
         }
      }
      
      //make initial recursive call
      return isPalindrome(cleaned);
   }
   
   public static boolean isPalindrome(String str){
      if (str.length() <= 1){ //base case
         return true;
      }
      
      String firstLetter = str.substring(0, 1);
      String lastLetter = str.substring(str.length() - 1);
      if (firstLetter.equals(lastLetter)){
         String middle = str.substring(1, str.length() - 1);
         return isPalindrome(middle);
      } else {
         return false;
      }
   }
   
   public static int exp(int x, int n){
      
   }
   
}