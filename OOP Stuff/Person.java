public class Person implements Printable{
   private String name;
   private int yearBorn;
   
   public Person(String name, int yearBorn){
      System.out.println(toString());
      this.name = name;
      this.yearBorn = yearBorn;
   }
   
   public Person(){
      name = "John Doe";
      yearBorn = 1900;
   }
   
   public void print(){
      System.out.println("John doe is " + (2018-1900) + " years old");
   }
   
   public String toString(){
      return name + " was born in " + yearBorn;
   }
}