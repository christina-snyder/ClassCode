public class ItemTester {
   public static void main(String[] args){
      Item thing1 = new Item(3.00, "Roasted Purple Potatoes", "These purple, magnificent potatoes come from our locally sourced garden and are cooked in a wood fire oven", "Eggs", true, 1);
      //System.out.println(thing1);
      
      Menu menu = new Menu("Flavor of the week");
      menu.addItem(thing1);
      Item thing2 = new Item(2.50, "French Fries", "Curly, Giant, Waffle, Allinone. Magic. Sprinkled with Cajun Seasoning", "Peanut Oil", false, 4);
      menu.addItem(thing2);
      Item thing3 = new Item(8.00, "Potato Burger", "A thin bun with pepper jack cheese and a fried egg served with special sauce and dash of bacon", "Eggs, Dairy", true, 5);
      menu.addItem(thing3);
      System.out.println(menu);
   }
}