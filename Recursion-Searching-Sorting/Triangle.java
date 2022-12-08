public class Triangle {
   private int length;
   
   public Triangle(int length){
      this.length = length;
   }
   
   public int getArea(){
      if (length == 0){
         return 0;
      } else {
         Triangle smaller = new Triangle(length - 1);
         int smallerArea = smaller.getArea();
         return smallerArea + length;
      }
   }
}