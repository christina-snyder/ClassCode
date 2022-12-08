public class CounterTester {
   public static void main(String[] args){
      //ObjName varName = new ObjName(parameters?);
      //Scanner scan = new Scanner(System.in); We created this object before
      Counter c1 = new Counter(); //Invoking the constructor
      Counter c2 = new Counter(10);
      int number = c1.getCount();
      System.out.println(number);
      c1.addOne();
      c1.addOne();
      c1.addMany(8);
      number = c1.getCount();
      System.out.println(number);
      System.out.println("Counter 2: " + c2.getCount());
      Counter c3 = new Counter();
      Counter[] arr = {c1, c2, c3};
      for (int i = 0; i < arr.length; i++){
         Counter current = arr[i];
         current.addOne();
         System.out.println("Current counter value: " + current.getCount());
      }
      for (Counter c : arr){
         c.addOne();
         System.out.println("Current counter value: " + c.getCount());
      }
      System.out.println("Counter of c1 outside loop: " + arr[0].getCount());
      
      Counter s = new Counter(5);
      Counter l = new Counter(4);
      combineCounters(s, l);
      int sNumber = s.getCount();
      int lNumber = l.getCount();
      System.out.println("Snumber: " + sNumber);
      System.out.println("Lnumber: " + lNumber);
   }
   
   public static void combineCounters( Counter staying, Counter leaving){
      int number = leaving.getCount();
      staying.addMany(number);
   }
}