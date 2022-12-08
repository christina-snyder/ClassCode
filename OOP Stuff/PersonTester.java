public class PersonTester {
   public static void main(String[] args){
      Person p = new Person("Justin Timberlake", 1981);
      Student s = new Student("Kesha", 1987, "Music");
      Instructor i = new Instructor("Dolly Parton", 1946, 10000000);
      
      //Printable thing = new Printable(); // not allowed
      Printable thing = new Person();
      
      
     /* System.out.println(p);
      System.out.println(s);
      System.out.println(i);
      
      Person[] people = {p, s, i};
      for (Person ind : people){
         System.out.println(ind);
      }  */
   }
}