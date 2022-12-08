public class Cat extends Animal {
   private int numLivesLeft;
   
   public Cat(String eyeColor, String hairColor, int numLivesLeft){
      super(eyeColor, hairColor);
      this.numLivesLeft = numLivesLeft;
   }
   
   public void speak(){
      System.out.println("meow");
   }  
   
   public int compareTo(Animal other){
      Cat c = (Cat) other;
      return this.numLivesLeft - c.numLivesLeft;
   }
}