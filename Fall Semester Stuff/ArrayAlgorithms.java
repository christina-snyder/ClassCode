public class ArrayAlgorithms {
   public static void main(String[] args){
      int[] numbers = {7, 5, 3, 1};
      System.out.println(numbers);
      printArray(numbers);
      System.out.println("hello");
      int[] other = numbers; //shallow copy
      int[] realOther = new int[numbers.length]; //starting our deep copy
      for (int i = 0; i<numbers.length; i++){
         realOther[i] = numbers[i]; //copy each individual element over
      }
      realOther[3] = 70; // this doesn't affect numbers
      System.out.println(other);
      other[1] = 100; //this does affect numbers 
      printArray(other);
      printArray(numbers);
      printArray(realOther);
      int[] doubled = doubleElements(realOther);
      printArray( realOther);
      printArray(doubled);
      int answer = sumUp(numbers);
      System.out.println(answer);
      System.out.println(sumUp(numbers));
      System.out.println(maxValue(numbers));
      String[] studentNames = {"bobby", "chris", "jorge", "tommy"};
      int[] grades = {85, 90, 96, 72};
      int[] testArr = {7, 1, 5, 3, 1};
      System.out.println(count(testArr, 1));
      
      int[] inserted = insert(testArr, 8, 1);
      printArray(inserted);
      remove(inserted, 0);
      printArray(inserted);
   }
   
   public static void remove(int[] arr, int index){
      for (int i = index; i < arr.length - 1; i++){
         arr[i] = arr[i + 1];
      }
      arr[arr.length-1] = 0;
   }
   
   public static int[] insert(int[] arr, int number, int index){
      int[] bigger = new int[arr.length + 1];
      for (int i = 0; i < arr.length; i++){
         bigger[i] = arr[i]; //copies our data (deep copy)
      }
      
      for (int i = bigger.length - 1; i > index; i--){
         bigger[i] = bigger[i - 1]; //shifts to the right
      }
      
      bigger[index] = number;
      return bigger;
   }
   
   //count ({7, 1, 5, 3, 1} ,  1) should return 2
   public static int count(int[] arr, int targetNumber){
      int counter = 0;
      for (int i = 0; i < arr.length; i++){
         int element = arr[i];
         if (element == targetNumber){
            counter++;
         }
      }
      return counter;
   }
   
   public static boolean contains(int[] arr, int targetNumber){
      for (int i = 0; i <arr.length; i++){
         int element = arr[i];
         if (element == targetNumber){
            return true;
         }
      }
      return false;
   }
   
   public static int find(int[] arr, int targetNumber){
      for (int i = 0; i < arr.length; i++){
         int element = arr[i];
         if (element == targetNumber){
            return i;
         }
      }
      return -1;
   }
   
   public static String findSmartestStudent(String[] names, int[] grades){
      //find index of largest grade
      //return names at that index
      
       String smartest = names[0];                        //int maxIndex = 0;
      int highestGrade = grades[0];                    //int highestGrade = grades[0];
      for (int i = 1; i<grades.length; i++){           //Same loop
         if (grades[i] > highestGrade){                //Same if
            highestGrade = grades[i];                    //maxIndex = i;
            smartest = names[i];                             //higestGrade = grades[i];
         }
      }
      return smartest;                                            //return names[maxIndex];

   }
   
   public static int maxValue(int[] arr){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++){
         if (arr[i] > max){
            max = arr[i];
         }
      }
      return max;
   }
   
   public static int minValue(int[] arr){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++){
         if (arr[i] < max){
            max = arr[i];
         }
      }
      return max;
   }
   
   public static int minValueIndex(int[] arr){
      int min = arr[0];
      int minIndex = 0;
      for (int i = 1; i < arr.length; i++){
         if (arr[i] < min){
            min = arr[i];
            minIndex = i;
         }
      }
      return minIndex;
   }
   
   public static int sumUp(int[] arr){
      //initialize total
      int total = 0;
      //loop over array
      for (int i = 0; i <arr.length; i++){
         //get the element
         int element = arr[i];
         //add it to total
         total = total + element;
      }   
      //return total
      System.out.println("The total is: " + total);
      return total;
   }
   
   //goal is to return an array with the elements doubled
   public static int[] doubleElements(int[] arr){
      int[] toReturn = new int[arr.length];
      for (int i = 0; i < arr.length; i++){
         toReturn[i] = arr[i] * 2;
      }
      return toReturn;
   }
   
   public static void printArray(int[] arr){
      //arr[2] = 500; this is bad- it changes our array
      for (int i = 0; i <arr.length; i++){
         int element = arr[i];
         System.out.print(element + ", ");
      }
      System.out.println(); //goes to the next line
   }
}