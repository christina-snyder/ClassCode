public class AquaticMammal extends Mammal {
   private double breathCapacity;
   private String homeWater;
   private double hairLength;
   
   /*
   double hairLength, double bodyTemp, int numLegs, boolean hasElongatedTail, boolean isVegetarian
   */
   public AquaticMammal(double bodyTemp, boolean isVegetarian, double breathCapacity, String homeWater){
      super(.001, bodyTemp, 0, true, isVegetarian);
      this.breathCapacity = breathCapacity;
      this.homeWater = homeWater;
   }
   
   public void jump(){
      System.out.println("Splash");
   }
   
   public void swim(){
      breathCapacity--;
      System.out.println("Woosh");
   }
   
   public void breathe(){
      super.breathe();
      breathCapacity *= 2;
   }
}