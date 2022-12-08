public class Triangle {
   private int size;
   
   public Triangle(int size){
      this.size = size;
   }
   
   public int findArea(){
      if (size == 1){
         return 1;
      }
      Triangle smaller = new Triangle(size - 1);
      int smallerArea = smaller.findArea();
      return size + smallerArea;
   }  
}