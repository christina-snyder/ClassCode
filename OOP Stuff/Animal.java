public abstract class Animal implements Comparable<Animal>{
   private String eyeColor;
   private String hairColor;
   
   public Animal(String eye, String hair){
      eyeColor = eye;
      hairColor = hair;
   }
   
   public void breathe(){
      System.out.println("Exhale, Inhale");
   }  
   
   public abstract void speak();
}