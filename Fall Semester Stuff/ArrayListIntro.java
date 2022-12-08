import java.util.ArrayList;
public class ArrayListIntro {
   public static void main(String[] args){
      ArrayList<String> list = new ArrayList<String>();
      System.out.println(list);
      list.add("a");
      list.add("b");
      list.add("c");
      System.out.println(list + ", Size: " + list.size());
      list.add(1, "x");
      System.out.println(list + ", Size: " + list.size());
      
      String letter = list.set(2, "k");
      System.out.println(list + ", old letter: " + letter);
      
      letter = list.remove(1);
      System.out.println(list + ", old letter: " + letter);
      
      System.out.println(list.get(2));
      
      ArrayList<String> list2 = new ArrayList<String>(list);
      System.out.println("list2: " + list2);
      list2.add("hello");
      System.out.println("list1: " + list);
      System.out.println("list2: " + list2);
      
      System.out.println(contains(list2, "k"));
      System.out.println(count(list2, "k")); // should print 1
      
      ArrayList<String> words = new ArrayList<String>();
      words.add("tournament");
      words.add("tree");
      words.add("tetris");
      words.add("empathy");
      words.add("elephant");
      System.out.println(words);
      System.out.println(countLetter(words, "t")); //should print 6
      System.out.println(findFirst(words));
      
      //ArrayList<int> test = new ArrayList<int>();
      /*
         ArrayLists only work with objects- not primitive types
         (int, double, boolean, and char are all primitive types)
         Wrapper Classes come in to save the day
         int -> Integer (Integer.MAX_VALUE or Integer.parseInt)
         double -> Double
         boolean -> Boolean
         char-> Character 
      */
      ArrayList<Integer> numList = new ArrayList<Integer>();
      numList.add(7);//auto-boxed (auto-wrapped)
      numList.add(new Integer(5)); //manual boxing
      numList.add(3);
      numList.add(1);
      Integer x = numList.get(0);
      int y = numList.get(0); //auto-un-boxing
      int z = x.intValue(); //stupid... manual unboxing
      
      //double x = 7;
      
      ArrayList<Integer> removeExample = new ArrayList<Integer>();
      removeExample.add(7);
      removeExample.add(5);
      removeExample.add(7);
      removeExample.add(7);
      removeExample.add(3);
      removeExample.add(7);
      System.out.println(removeExample);
      removeAll(removeExample, 7);
      System.out.println(removeExample);
   }
   
   public static boolean contains(ArrayList<String> arr, String target){
      for (int i = 0; i < arr.size(); i++){
         String curr = arr.get(i);
         if (curr.equals(target)){
            return true;
         }
      }
      return false;
   }
   
   public static int count(ArrayList<String> arr, String target){
      int counter = 0;
      for (String curr: arr){
         if (curr.equals(target)){
            counter++;
         }
      }
      return counter;
   }
   
   public static int countLetter(ArrayList<String> arr, String targetLetter){
      int counter = 0;
      for (int i = 0; i < arr.size(); i++){
         String currWord = arr.get(i);
         for (int k = 0; k < currWord.length(); k++){
            String currLetter = currWord.substring(k, k+1);
            if (currLetter.equals(targetLetter)){
               counter++;
            } //ends if
         } //ends string loop
      }  //ends list loop
      return counter;
   }
   
   public static String findFirst(ArrayList<String> list){
      String toReturn = list.get(0);
      for (String curr : list){
         int number = curr.compareTo(toReturn);
         if (curr.compareTo(toReturn) < 0){
            toReturn = curr;
         }
      }
      return toReturn;
   }
   
   public static int sumEvens(ArrayList<Integer> list){
      //this method should return the sum of the even numbers
      int sum = 0;
      for (int x : list){ //auto un-boxing happens here!
         if (x % 2 == 0){
            sum += x;
         }
      }
      return sum;
   }
   
   public static ArrayList<Integer> getIndexOfEven(ArrayList<Integer> list){
      ArrayList<Integer> toReturn = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++){
         if (list.get(i) % 2 == 0){
            toReturn.add(i);
         }
      }
      return toReturn;
   }
   
   public static void removeAll(ArrayList<Integer> list, int targetNumber){
      /*
      Solution 1
      for (int i  = 0; i <list.size(); i++){
         if (list.get(i) == targetNumber){
            list.remove(i);
            i--;
         }
      }
      */
      
      /*for (int i = list.size() - 1; i >= 0; i--){
         if (list.get(i) == targetNumber){
            list.remove(i);
         }   
      }*/
      
      int i = 0;
      while (i < list.size()){
         if (list.get(i) == targetNumber){
            list.remove(i);
          } else {
            i++;
          }
   }
}