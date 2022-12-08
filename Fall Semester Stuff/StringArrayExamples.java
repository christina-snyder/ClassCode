public class StringArrayExamples {
   public static void main(String[] args){
      String[] name = {"Christina", "Elvira", "aaron", "Snyder"};
      String initials = getInitials(name);
      System.out.println(initials);
      System.out.println(countLetters(name));
   }
   //String[] name = {"Christina", "Elvira", "aaron", "Snyder"};
   public static int countAs(String[] arr){
      int count = 0;
      for (String word : arr){
         for (int i = 0; i < word.length(); i++){
            String letter = word.substring(i, i+1);
            if (letter.equals("a")){
               count++;
            } //ends if
         } //ends word loop
      } //ends my array loop
      return count;
   }
   
   public static int countLetters(String[] arr){
      int count = 0;
      for (int i = 0; i < arr.length; i++){
         String word = arr[i];
         count += word.length();
         //could also do: count += arr[i].length();
         //this would have also been a good place for a for each loop
      }
      return count;
   }
   
   public static String getInitials(String[] arr){
      /*String firstName = arr[0];
      String firstLetter = firstName.substring(0, 1);
      String secondLetter = arr[1].substring(0, 1);
      String thirdLetter = arr[2].substring(0, 1);
      return firstLetter + secondLetter + thirdLetter;*/
      String toReturn = "";
      for (String name : arr){
         String letter = name.substring(0, 1);
         toReturn += letter;
      }
      return toReturn;
   }
}