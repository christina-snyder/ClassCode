public class MammalTester {
   public static void main(String[] args){
   // public Mammal(double hairLength, double bodyTemp, int numLegs, boolean hasElongatedTail, boolean isVegetarian){
      Mammal zebra1 = new Mammal(1, 98, 4, true, true);
      Mammal zebra2 = zebra1;
      Mammal zebra3 = new Mammal(1, 98, 4, true, true);
      //public AquaticMammal(double bodyTemp, boolean isVegetarian, double breathCapacity, String homeWater){

      AquaticMammal otter = new AquaticMammal(98, false, 100, "Salt");
      
      System.out.println("1.equals(2)?: " + zebra1.equals(zebra2));
      System.out.println("1.equals(3)?: " + zebra1.equals("hello"));
      
      
     //boolean result = var instanceof ClassName;
     boolean isMammal = zebra1 instanceof Mammal;
     boolean isAM = zebra1 instanceof AquaticMammal;
     boolean isObj = otter instanceof Object;
     System.out.println(isMammal + ", " + isAM + ", " + isObj);
   }
}