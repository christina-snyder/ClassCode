public class MathExamples {
   public static void main(String[] args){
      //Square Roots-> Math.sqrt(value)
      double ans = Math.sqrt(35);
      System.out.println("The square root of 35 is: " + ans);
      
      //Exponents-> Math.pow(base, exp)
      //5 cubed would be Math.pow(5, 3);
      double cubed = Math.pow(5, 3);
      System.out.println("5 Cubed is: " + cubed);
      System.out.println("5 Cubed is: " + Math.pow(5, 3));
      
      double a = 3;
      double b = 4;
      double insides = Math.pow(a, 2) + Math.pow(b,2);
      double c = Math.sqrt(insides);
      
      a = 1;
      b = -1;
      c = -6;
      double underRoot = Math.pow(b, 2) - 4 * a * c;
      double topPlus = -b + Math.sqrt(underRoot);
      double topMinus = -b - Math.sqrt(underRoot);
      double xPlus = topPlus / 2 * a;
      double xMinus = topMinus / 2 * a;
      System.out.println("x = (" + xPlus + ", " + xMinus + ")");
      
      //Absolute Value-> Math.abs(value);
      System.out.println(Math.abs(-6));
      
      //Math.sin(value) Math.cos(value)
      
      //Math.random() 
      double number = Math.random();
      System.out.println(number);
      number = number * (5 + 1) + 1; //we have to add a number to the multiplier if we need whole numbers
      int wholeNumber = (int) number;
      System.out.println(number);
      
      System.out.println(3/2.0);
      //promotion is the act of changing an int to a double (this is automatic)
      
      int x = 17/4;
      double y = 17/4;
      double z = 17.0/4;
      int zz = (int) (17/4.0);
      int modAnswer = 17 % 4;
      
      final int NUM_STUDENTS = 121;
      //NUM_STUDENTS = 2; 
      System.out.println(Math.PI);
      //System.out.printf("Format String", var1, var2, var3);\
      int x1 = 3;
      int x2 = -2;
      System.out.printf("(%d, %d)\n", x1, x2);
      double decimal = 1.22345678912345673456;
      System.out.printf("the \"number\" is %.2f\n", decimal);
      
      int numSiblings = 4;
      int numPets = 1;
      int numCousins = 28;
      System.out.printf("My name is Ms. Snyder, I have %d siblings, %d pets, and %d first cousins!", numSiblings, numPets, numCousins);
   }
}