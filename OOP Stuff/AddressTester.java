public class AddressTester {
   public static void main(String[] args){
      Address address1 = new Address(966, "W. Paces Ferry", "Atlanta", "GA", "30327");
      address1.print();
      System.out.println(address1);
      
      Address address2 = new Address(1234, "Happy St", 805, "SunnyVille", "GA", "30024");
      address2.print();
   }
}