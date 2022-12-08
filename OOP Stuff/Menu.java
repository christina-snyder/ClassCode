import java.util.ArrayList;
public class Menu implements Measurable{
   private String restName;
   //different parts
   private ArrayList<Item> food;
   
   public Menu(String restName){
      this.restName = restName;
      food = new ArrayList<Item>();
   }
   
   public void addItem(Item i){
      food.add(i);
   }
   
   public String toString(){
      String toReturn = restName + "\n";
      for (Item i : food){
         toReturn += i.toString();
         toReturn += "\n\n";
      }
      toReturn += "\t\t\t\t\t**Spice Level**\n";
      toReturn += "\t\t1\t\t\t2\t\t\t3\t\t\t4\t\t\t5\n";
      toReturn += "Wimpy          Common         Volcanic";
      return toReturn;
   }
   
   public int getMeasure(){
      return food.size();
   }

   //addItem
}