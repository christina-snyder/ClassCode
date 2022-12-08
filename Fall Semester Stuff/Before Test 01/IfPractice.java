public class IfPractice {
   public static void main(String[] args){
      int windSpeed = 16;
      if (windSpeed < 74) {
         System.out.println("You're not a hurricane, yet");
         if (windSpeed >= 39 && windSpeed <=73){
            System.out.println("You're a Tropical Storm");
         } else {
            System.out.println("You're a tropical depression");
         }
      } else if (windSpeed >= 74 && windSpeed <= 95){
         System.out.println("You're a measly cat 1");
      } else if (windSpeed > 95 && windSpeed <= 110) {
         System.out.println("You're a cat 2 hurricane, meh");
      } else if (windSpeed >= 111 && windSpeed <= 129) {
         System.out.println("You're a cat 3 hurricane");
      } else if (windSpeed > 130 && windSpeed <= 156) {
         System.out.println("You're a cat 4 hurricane, woah");
      } else {
         System.out.println("Watch out, cat 5 coming through");
      }
      
      
      String word = "cat";
      String word2 = new String("cat");
      if (word.equals(word2)){ //this is the correct way to compare strings
         System.out.println("meow");
      } else {
         System.out.println("woof");
      }
      
      //<, >, <=, ==, != these don't work with strings!
      
      String a = "cat3";
      String b = "colors";
      int x = a.compareTo(b);
      System.out.println(x);
      int y = b.compareTo(a);
      System.out.println(y);
   }
}