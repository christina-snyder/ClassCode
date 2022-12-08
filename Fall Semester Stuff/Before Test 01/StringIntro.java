public class StringIntro {
   public static void main(String[] args){
      String word = "hello";
      int numLetters = word.length();
      System.out.printf("The number of characters in %s is %d\n", word, numLetters);
      
      System.out.println(word.charAt(0));
      System.out.println(word.charAt(2));
      char firstLetter = word.charAt(0);
      char lastLetter = word.charAt(4);
      System.out.println("" + firstLetter + lastLetter);
      int a = 3;
      int b = 4;
      System.out.println(a + b + "fish");
      System.out.println("fish" + a + b);
      System.out.println("fish" + (a + b));
      
      //strVar.substring(startIndex);
      String lastBit = word.substring(2);
      System.out.println(lastBit);
      
      //strVar.substring(startIndex, endIndex); endIndex is exclusive
      String middleBit = word.substring(1, 4);
      System.out.println(middleBit);
      
      lastBit = word.substring(2, word.length());
      //System.out.println(word.charAt(5)); this will error -> index out of bounds
      System.out.printf("Last bit: %s\n", lastBit);
      System.out.println(word.substring(5).length());
      
      //strVar.indexOf(somethingToLookFor) -> this returns the index where the thing exists, or -1 if it DNE
      int spot = word.indexOf("e");
      System.out.printf("In %s, e lives at spot %d\n", word, spot);
      
      spot = word.indexOf("l");
      System.out.printf("In %s, l lives at spot %d\n", word, spot);
      
      String randomString = "kangaroo";
      int gIndex = randomString.indexOf("g");
      String firstPart = randomString.substring(0,gIndex);
      String secondPart = randomString.substring(gIndex + 1);
      System.out.println(firstPart + ", " + secondPart);
      System.out.printf("The g lives at spot %d, before the g is %s, after the g is %s", gIndex, firstPart, secondPart);
      
      String firstHalf = randomString.substring(0, 4);
      String secondHalf = randomString.substring(4, 8);
      
      //String firstHalf = strVar.substring(0, strVar.length() / 2);
      //String secondHalf = strVar.substring(strVar.length() / 2, strVar.length());
      
   }
}