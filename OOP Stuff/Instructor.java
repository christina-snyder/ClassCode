public class Instructor extends Person {
   private int salary;
   
   public Instructor(String name, int yearBorn, int salary){
      super(name, yearBorn);
      this.salary = salary;
   }
   
   public String toString(){
      return super.toString() + " and they make $" + salary + " annually";
   }
}