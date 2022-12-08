public class VariableAndObjectScopePractice{
   public static void main(String[] args){
     Counter c1 = new Counter(10);
     Counter c2 = new Counter(20);
     consolidate(c1, c2);
     System.out.println("Counter 1: " + c1.getCount());
     System.out.println("Counter 2: " + c2.getCount());
     
     int num1 = 7;
     int num2 = 10;
     consolidateNumbers(num1, num2);
     System.out.println("Num1: " + num1);
     System.out.println("Num2: " + num2);
     
     Counter c3 = new Counter(30);
     int x = 10;
     delplete(c3, x);
     System.out.println("Counter 3: " + c3.getCount());
     System.out.println("X: " + x);
     
     Counter[] arr = {c1, c2, c3};
     Counter[] arr2 = new Counter[3];
     arr2[0] = c1;
     arr2[1] = c2;
     arr2[2] = c3;
     
     arr[0].addOne();
     arr[0].getCount();
     c1.addMany(-1);
     System.out.println("Counter 1: " + c1.getCount());
     
     
     int x1 = 7;
     int y1 = 5;
     int z1 = 3;
     int[] numbers = {x1, y1, z1};
     numbers[0]++;
     System.out.println("X1: " + x1);
     
     for (Counter c : arr){
      c.addOne();
     }
     
     for (int num: numbers){
      num++;
     }

      Counter[] countArr = new Counter[3];
      countArr[0] = new Counter(10);
      countArr[1] = new Counter(20);
      countArr[2] = new Counter(20);
      System.out.println("The total should be 50. It's: " + total(countArr));
      reset(countArr);
      for (Counter c : countArr){
         System.out.println("Curr Count: " + c.getCount());
      }
   }
   
      public static void reset(Counter[] counters){
         //post-condition: all counters have a count of 0
         //HINT: addMany will subtract when given a negative number
         for (Counter c : counters){
            int currValue = c.getCount();
            c.addMany(-currValue);
         }
      }  
   
   public static int total(Counter[] counters){
      //This method should return the total tally of all the counters in the parameter
      //Regular old sum algorithm.
      //Initialize a summing variable
      /*int total = 0;
      //loop
      for (int i = 0; i < counter.length; i++){
      //add up counts
         total += counter[i].getCount();
      }
      //return total
      return total;
      */
      
      int total = 0;
      for (Counter c : counters){
         total += c.getCount();
      }
      return total;
   }
   
   public static void delplete(Counter cA, int x){
      int temp = cA.getCount();
      x += temp;
      cA.addMany(-temp);
   }
   
   public static void consolidate(Counter cA, Counter cB){
      cA.addMany(cB.getCount());
   }
   
   public static int consolidateNumbers(int a, int b){
      a += b;
      return a;
   }
   
   
   
   
   
   
   
   
   

    /*


   
  
   
        
     
*/
}