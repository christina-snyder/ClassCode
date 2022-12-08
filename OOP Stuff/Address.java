public class Address {
   private int houseNumber;
   private String street;
   private int aptNumber;
   private String city;
   private String state;
   private String zipCode;
   
   //javaDocing
   public Address(int houseNumber, String street, int aptNumber, String city, String state, String zipCode){
      this.houseNumber = houseNumber;
      this.street = street;
      this.aptNumber = aptNumber;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
   }
   
   public Address(int houseNumber, String street, String city, String state, String zipCode){
      /*this.houseNumber = houseNumber;
      this.street = street;
      aptNumber = -1;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;*/
      this(houseNumber, street, -1, city, state, zipCode);
   }
   
   public void print(){
      if (aptNumber == -1){
         System.out.println(houseNumber + " " + street);
      } else {
         System.out.println(houseNumber + " " + street + ", apt #" + aptNumber);
      }
      
       System.out.println(city + ", " + state + " " + zipCode);
   }
   
   public String toString(){
      String toReturn = houseNumber + " " + street;
      if (aptNumber == -1){
         toReturn += "\n";
      } else {
         toReturn += ", apt #" + aptNumber + "\n";
      }
      toReturn += city + ", " + state + " " + zipCode;
      return toReturn;
   }
}