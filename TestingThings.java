import java.util.ArrayList;

public class TestingThings {
   public static void main(String[] args){
      double x = Math.sqrt(2);
      double y = 2;
      System.out.println(x*x);
      if (x*x <= y + .005 && x*x >= y - .005 ){ System.out.println(x);}
      else {System.out.println(y); }
      ArrayList<String> animals = new ArrayList<String>();
      animals.add("bear");
      animals.add("zebra");
      animals.add("bass");
      animals.add("cat");
      animals.add("koala");
      animals.add("baboon");
      System.out.println(animals);
      manipulate(animals);
      System.out.println(animals);
      
   }
   
   public static void manipulate(ArrayList<String> animals){
      for (int k = animals.size() - 1; k > 0; k--){
         if (animals.get(k).substring(0, 1).equals("b")){
            //String x = animals.remove(k);
            animals.add(animals.size() - k,   animals.remove(k));
         }
      }
   }
}