public class LoopIntro {
   public static void main(String[] args){
      //Iteration or iterative statement
      /*
         while (conditition) {
            //stuff to run while the condition is true
         }
      */
      int number = 1;
      while (number <= 100){
         System.out.println(number);
         number+=2; //number = number + 1;
      }
      
      number = 1;
      while (number <= 100){
         if (number % 2 == 1) {
            System.out.println(number);
         }   //ends if
          number++;
      } //ends while loop
      
      number = 1;
      int count = 0;
      while (number <= 100){
         if (number % 3 == 0){
            count++;
         }
         number++;
      }
      System.out.println("The number of numbers divisible by 3 between 1 and 100 is: " + count);
      
      double principle = 300;
      double interestRate = .02;
      int numYears = 10;
      int currYear = 0;
      while (currYear < numYears) {
         currYear++;
         double interestAdded = principle * interestRate;
         principle += interestAdded; //principle = principle + interestAdded
      }
      System.out.println("After 10 years, you have $"+principle);
      
      int fact = 4;
      int product = 1;
      while (fact > 0){
         product = product * fact;
         fact--;
      }
      System.out.println(fact + "! is " + product);
      
      int sum = 0;
      int thing = 5;
      while (thing > 0){
         sum -= thing; //sum = sum - thing;
         thing--;
      }
   } //ends my method
} //ends class