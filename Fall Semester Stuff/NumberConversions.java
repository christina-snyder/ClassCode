public class NumberConversions {
   public static void main(String[] args){
      double number = bin2dec("110101");
      System.out.println(number);
      String bitString = dec2bin(53);
      System.out.println((char) 65);
      String hex = bin2hex("110101");
      System.out.println(hex);
   }
   
   public static double bin2dec(String bitString){
      double decimal = 0;
      for (int index = 0; index < bitString.length(); index++){
         int exp = bitString.length() -1 -index;
         String bit = bitString.substring(index, index + 1);
         if (bit.equals("1")){
            double powOf2 = Math.pow(2, exp);
            decimal += powOf2;
         }
      }
      return decimal;
   }
   
   public static String dec2bin(int number){
      String toReturn = "";
      while (number > 0){
         int digit = number % 2;
         toReturn = digit + toReturn; //toReturn = toReturn + digit;
         number /= 2; 
      }
      return toReturn;
   }
   
   public static String bin2hex(String bitString){
      String toReturn = "0x";
      int numZeros = 4 - (bitString.length() % 4);
      if (numZeros != 4){
         for (int i = 0; i < numZeros; i++){
            bitString = "0" + bitString;
         }
      }
      for (int index = 0; index < bitString.length(); index = index + 4){
         String group = bitString.substring(index, index + 4);
         int number = (int) bin2dec(group);
         if (number < 10){
            toReturn = toReturn + number;
         } else {
            char letter = (char) ('A' + (number - 10));
            toReturn = toReturn + letter;
         }   
      }
      return toReturn;
   }
}