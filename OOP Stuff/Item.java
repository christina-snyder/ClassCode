public class Item {
   private double price;
   private String name;
   private String ingredients;
   private String allergens;
   private boolean isGF;
   private int spicy;
   
   public Item(double price, String name, String ingredients, String allergens, boolean isGF, int spicy){
      this.price = price;
      this.name = name;
      this.ingredients = ingredients;
      this.allergens  = allergens;
      this.isGF = isGF;
      this.spicy = spicy;
   }
   
   public void changePrice(double newPrice){
      price = newPrice;
   }
   
   public double getPrice(){
      return price;
   }
   
   public String getName(){
      return name;
   }
   
   public String getIngredients(){
      return ingredients;
   }
   
   public String getAllergens(){
      return allergens;
   }
   
   public boolean getIsGF(){
      return isGF;
   }
   
   public int getSpiceLevel(){
      return spicy;
   }
   
   public String get5Words(String text){
      int firstSpace = text.indexOf(" ");
      int count = 0;
      int lastSpace = firstSpace;
      while (count < 4 && lastSpace != -1){
         count++;
         lastSpace = text.indexOf(" ", lastSpace + 1);
      }
      if (lastSpace == -1){
         lastSpace = text.length();
      }
      return text.substring(0, lastSpace);
   }
   
   public String getFormattedText(String text){
      String fiveWords = get5Words(text);
      String toReturn = fiveWords + "\n\t";
      String chopped = text.substring(fiveWords.length() + 1);
      while (chopped.length() > 0){
         fiveWords = get5Words(chopped);
         toReturn += fiveWords + "\n\t";
         chopped = chopped.substring(Math.min(fiveWords.length() + 1, chopped.length()));
      }
      return toReturn.substring(0, toReturn.length() -2);
   }
   
   public String toString(){
      String toReturn = name + " ";
      if (isGF == true){
         toReturn += "(gf)";
      } 
      toReturn += " . . . . . . . . . . " + price + "\n\t[" + spicy + "] ";
      
      toReturn += getFormattedText(ingredients);
      
      if (!allergens.equals("")){
         toReturn +=  "\n\t" + "Contains: " + allergens;
      }
      return toReturn;
   }
}