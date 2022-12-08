public class IfIntro {
   public static void main(String[] args){
      //if statment (ie, Conditional statements) are used to make decisions
      
      int x = 7;
      if (x > 0) {
         System.out.println("The number is positive");
      } else if (x < 0) {
         System.out.println("The number is negative");
      } else {
         System.out.println("the number is zero");
      }
      
      /* boolean operators
         <
         >
         <=
         >=
         ==
         != (not equals)
      */
      boolean value = true;
      boolean value2 = false;
      
      boolean value3 = x == 2;
      System.out.println(value3);
      
      if (value3 == false){
         System.out.println("X is not 2.");
      }
      
      /*
      if (number > 10){
         //do something
      } else {
         //do something else
      }
      */
      
      int grade = 95;
      if (grade >= 90){
         System.out.println("you have an A");
      } else if (grade >= 80){
         System.out.println("you have a B");
      } else if (grade >= 70){
         System.out.println("you have a C");
      } else {
         System.out.println("you have an F");
      }
      
      int a = 3;
      int b = 7;
      boolean ans = a <= b;
      boolean ans2 = a != b;
      boolean ans3 = !(a >= b || (a + 4) == b); //a < b && a + 4 != b;
      boolean ans4 = b != a && b < a;
      boolean ans5 =!( a < b && b < 10 && ans3); //a >= b || b >= 10 || !ans3
      boolean ans6 = !ans;
      
   } //close main method
}// close class