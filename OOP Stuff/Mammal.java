public class Mammal {
   private double hairLength, bodyTemp;
   private int numLegs;
   private boolean hasElongatedTail, isVegetarian;
   
   public Mammal(double hairLength, double bodyTemp, int numLegs, boolean hasElongatedTail, boolean isVegetarian){
      this.hairLength = hairLength;
      this.bodyTemp = bodyTemp;
      this.numLegs = numLegs;
      this.hasElongatedTail = hasElongatedTail;
      this.isVegetarian = isVegetarian;
   }
   
   public double getHairLength(){
      return hairLength;
   }
   
   public void breathe(){
      System.out.println("exhale, inhale, repeat");
   }
   
   public void jump(){
      System.out.println("Boing");
   }
   
   public boolean equals(Object other){
      if (other instanceof Mammal) {
         Mammal otherMammal = (Mammal) other; //accepting risk
       double otherLength = otherMammal.getHairLength();
       return this.hairLength == otherLength;
       } else {
         return false;
       }
   }
}