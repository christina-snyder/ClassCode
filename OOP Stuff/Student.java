public class Student extends Person {
   private String major;
   
   public Student(String name, int yearBorn, String major){
      super(name, yearBorn);
      this.major = major;
   }
   
   public String toString(){
      return super.toString() + " and their major is " + major;
   }
}