public class MethodIntro {
   public static void main(String[] args){
      int x = 3;
      int y = 4;
      double z = Math.sqrt(x*x + y*y);
       int a = 1;
      int b = -1;
      int c = -6;
      double ans = pythagorean(3, 4);
      System.out.println("The hypotenuse is: " + ans);
      
      
      
      double underRoot = Math.pow(b, 2) - 4*a*c;
      double topPos = -b + Math.sqrt(underRoot);
      double topNeg = -b - Math.sqrt(underRoot);
      double bottom = 2*a;
      double xPos = quadPos(a, b, c);
      double xPos2 = quadPos(a+1, b, c);
      double xPos3 = quadPos(a+2, b, c);
      double xPos4 = quadPos(a, b+1, c);
      double xPos5 = quadPos(a, b, c+3);
      double xPos6 = quadPos(a, b+3, c);
      double xPos7 = quadPos(a+4, b, c);
      double xNeg = quadNeg(a, b, c);
      System.out.println("(" + xPos + ", " + xNeg + ")");
      

   } //ends my main method
   
   //a method is a reusable piece of code, that takes data and returns something
   //public static returnType methodName(dataType1 var1, dataType2 var, etc)
   
   public static double pythagorean(int a, int b){
      double c = Math.sqrt(a*a + b*b);
      return c;
   }
   
   public static double quadPos(int a, int b, int c){
      double top = -b + Math.sqrt(b*b - 4*a*c);
      double bottom = 2 * a;
      double toReturn = top/bottom;
      return toReturn;
   }
   
   public static double quadNeg(int a, int b, int c) {
      double top = -b - Math.sqrt(b*b - 4*a*c);
      double bottom = 2 * a;
      double toReturn = top/bottom;
      return toReturn;
   }

} //ends class
