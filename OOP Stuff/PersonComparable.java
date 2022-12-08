public class PersonComparable implements Comparable<PersonComparable> {
   private String name;
   private int yearBorn;
   
   public PersonComparable(String name, int yearBorn){
      this.name = name;
      this.yearBorn = yearBorn;
      System.out.println(this.toString());
   }
   
   public int compareTo(PersonComparable grandpa){
      //Person p = (Person) other;
      int otherYear = grandpa.getYear();
      if (this.yearBorn > otherYear){
         return 1;
      } else if (this.yearBorn < otherYear){
         return -1;
      } else {
         return 0;
      }
   }
   
   public int getYear(){
      return yearBorn;
   }
   
   public PersonComparable(){
      name = "John Doe";
      yearBorn = 1900;
   }
   
   public String toString(){
      return name + " was born in " + yearBorn;
   }
}