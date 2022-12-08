public class HelloWorld {
   public static void main(String[] args) {
      //comments start with two forward slashed
      //non executed lines of code
      /*
      this is a block comment
      I can comment multiple lines all at once
      
      */
      System.out.print("Hello World!"); //print vs println, the ln makes it go to the next line
   
      System.out.println("----------------");
   
      System.out.println((3 + 4) * 4 / 7);
      
      //int is short for integers, ints hold whole numbers only (no decimals)
      int a = 1;
      System.out.println(a);
      System.out.println("a");
      
      //int b = 7.2; this is not allowed
      double b = 7.2;
      double c = -6;
      System.out.println(c);
      //variable declaration is always dataType varName = value;
      
      /* Variable Naming rules and conventions
         Rule #1- names are always alphanumeric (also underscores)
         Rule #2- name cannot contain spaces
         Rule #3- names must begin with a letter (7up is not okay, up7 would be fine)
         
         Convention #1- variable names begin with a lowercase letter
         Convention #2- class names begin with a capital letter
         Convention #3- camelCase- capitalizing the first letter of every word (numberOfPeanutButterSandwiches vs numberofpeanutbuttersandwiches)
         Convention #3.5- using underscores for spaces (number_of_peanut_butter_sandwiches)
         Convention #4- variables names are descriptive
      */
      
      double tabTotal = 15.74;
      double tipPerc = .20;
      double tipAmount = tabTotal * tipPerc;
      tabTotal = tabTotal + tipAmount;
      System.out.println("A 20% tip on a 15.74 tab means a total of" + tabTotal);
      //concatenation is a fancy way of saying gluing things together

   }
}