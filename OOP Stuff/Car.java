public class Car {
   private double currentFuelLevel;
   private double mpg;
   
   public Car(){
      currentFuelLevel = 5;
      this(20);
   }
   
   /*public Car(int mpg){
      System.out.println("INTEGER");
      currentFuelLevel = 0;
      this.mpg = mpg;
   }*/
   
   public Car(double mpg){
      System.out.println("DOUBLE");
      currentFuelLevel = 0;
      this.mpg = mpg;
   }
   
   public double drive(int distance){
      currentFuelLevel -= distance / mpg;
      return currentFuelLevel;
   }
   
   public double getGasLevel(){
      return currentFuelLevel;
   }
   
   public double addGas(double amt){
      currentFuelLevel += amt;
      return currentFuelLevel;
   }
}