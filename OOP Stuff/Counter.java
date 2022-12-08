public class Counter {
   //Instance Variables
   //private dataType varName;
   private int count;
   
   //Constructor(s)
   //Constructors always have the same as the class
   //There is NO return type
   public Counter(){
      this(1);
   }
   
   public Counter(int startingValue){
      count = startingValue;
   }
   
   //Instance Methods
   //They're not static
   //Modifier ReturnType MethodName(DT1 Var1, DT2 Var2)
   public int getCount(){ //getter method (accessor method)
      return count;
   }
   
   public void addOne(){ //mutator method
      count = count + 1;
   }
   
   public void addMany(int num2Add){
      count += num2Add;
   }
}