public class Array2DIntro {
   public static void main(String[] args){
      int[][] arr2d = { {7, 5} , {3, 1} , {2, 8} };
      int numRows = arr2d.length;
      int numCols = arr2d[0].length;
      System.out.println("I have a " + numRows + "x" + numCols + " array!");
      System.out.println(arr2d[1][0]);
      printArray(arr2d);
      System.out.println(sumUp(arr2d));
      int[][] rowTotal = sumRows(arr2d);
      printArray(rowTotal);
      int[][] colTotal = sumCols(arr2d);
      printArray(colTotal);
      int[] maxIndex = findMaxIndex(arr2d);
      System.out.println("Row: " + maxIndex[0] + ", Col: " + maxIndex[1]);
      //printArray(maxIndex);
      printArray(arr2d);
      int[][] bigGradeBook = computeGrades(arr2d);
      printArray(bigGradeBook);
      
      /*
      Neighbors:
      a: i - 1, j - 1
      b: i - 1, j
      c: i - 1, j + 1
      d: i, j + 1
      e: i + 1, j + 1
      f: i + 1, j
      g: i + 1, j - 1
      h: i, j - 1
      */
      
      String[][] arr = new String[3][3];
      arr[0][0] = "X";
      arr[0][2] = "X";
      arr[1][0] = "X";
      arr[1][1] = "X";
      arr[1][2] = "O";
      arr[2][0] = "X";
      arr[2][1] = "O";
      printStrArray(arr);
      System.out.println(checkTicTacToe(arr));
      //arr[0][0].length(); triggers null pointer exception (NPE)
   }
   
   public static boolean checkTicTacToe(String[][] arr){
      for (int i = 0; i <arr.length; i++){
         boolean flag = true;
         for (int j = 0; j < arr[0].length; j++){
            if (arr[i][j] != null && !arr[i][j].equals("X")){
               flag = false;
            } else if (arr[i][j] == null){
               flag = false;
            }
         }
         if (flag == true){
            return true;
         }
      }
      
      for (int j = 0; j <arr[0].length; j++){
         boolean flag = true;
         for (int i = 0; i < arr.length; i++){
            if (arr[i][j] == null ||  !arr[i][j].equals("X")){
               flag = false;
            }//ends if
         }//ends inner loop
         if (flag == true){
            return true;
         }
      }
      
      //test major diagonal
      boolean flag = true;
      for (int i = 0; i < arr.length; i++){
         if (arr[i][i] == null || arr[i][i].equals("O") ){
            flag = false;
         }
      }
      if (flag == true){
         return true;
      }
      
      //test minor diagonal
      boolean flag = true;
      for (int i = 0; i <arr.length; i++){
         if (arr[i][arr.length - 1 - i] == null || arr[i][arr.length - 1 - i].equals("O") ){
            flag = false;
         }   
      }
      if (flag == true){
         return true;
      }
      return false;
   }
   
   public static int sumAround(int[][] arr, int row, int col){
      int sum = 0;
    /*  if (isGoodIndex(arr, row-1, col-1)){
         sum += arr[row-1][col-1];
      }
      */
      
      for (int i = row-1; i <= row +1; i++){
         for (int j = col-1; j <= col + 1; j++){
            if (row == i && col == j){
               //do nothing
            } else {
               if (isGoodIndex(arr, i, j)){
                  sum += arr[i][j];
               }//ends inner if   
            }//ends else
         }//ends inner for
      }//ends outer for
      return sum;
   }//ends method
   
   /*
   This method should return true if my row index and col index are good, valid indeces
   */
   public static boolean isGoodIndex(int[][] arr, int row, int col){
      if (row < 0){
         return false;
      } else if (col < 0){
         return false;
      } else if (row >= arr.length){
         return false;
      } else if (col >= arr[0].length){
         return false;
      } else {
         return true;
      }  
   }
   
   public static int[][] computeGrades(int[][] gradebook){
      int numAssignments = gradebook[0].length;
      int numStudents = gradebook.length;
      int newRowSize = numStudents + 1;
      int newColSize = numAssignments + 1;
      int[][] bigger = new int[newRowSize][newColSize];
      //int[][] bigger = new int[gradebook.length + 1][gradebook[0].length + 1]; one line solution
      
      for (int i = 0; i < numStudents; i++){
         for (int j = 0; j < numAssignments; j++){
            bigger[i][j] = gradebook[i][j];
         }
      }
      
      
      for (int i = 0; i < numStudents; i++){
         int sum = 0;
         for (int j = 0; j <numAssignments; j++){
            sum += gradebook[i][j];
         } //ends inner j loop
         int average = sum / numAssignments;
         bigger[i][numAssignments] = average;
         //bigger[i][bigger[0].length - 1]
         //bigger[i][gradebook[0].length]
      }
      
      for (int j = 0; j < numAssignments; j++){
         int sum = 0;
         for (int i =0; i <numStudents; i++){
            sum += gradebook[i][j];
         }
         int average = sum / numStudents;
         bigger[numStudents][j] = average;
      }
      
      int gradeTotal = sumUp(gradebook);
      int average = gradeTotal / (numStudents * numAssignments);
      bigger[numStudents][numAssignments] = average;
      
      return bigger;
   }  
   
   
   /**
   *  Write a method that will take in a number and
   *  return a square checkerboard made up of "$" and "*"
   *  @ param num the size of the checkerboard
   *  @ return a square string array that looks like a checkerboard of "*" and "$"
   */
   public static String[][] checkerboard(int num){
      //make the array
      //loops?
      //fill it in!
         //when do we put $?
         //when do we put *?
         return null;
   }
   
    public static int[] findMaxIndex(int[][] arr){
      int max = arr[0][0];
      int[] indexes = {0, 0};
      for (int i = 0; i <arr.length; i++){
         for (int j = 0; j <arr[0].length; j++){
            int element = arr[i][j];
            if (element > max){
               max = element;
               //indexes = {i, j};
               indexes[0] = i;
               indexes[1] = j;
            } //ends if
         }//ends j loop
      }//ends i loop
      return indexes;
   }
   
   public static int findMax(int[][] arr){
      int max = arr[0][0];
      for (int i = 0; i <arr.length; i++){
         for (int j = 0; j <arr[0].length; j++){
            int element = arr[i][j];
            if (element > max){
               max = element;
            } //ends if
         }//ends j loop
      }//ends i loop
      return max;
   }
   
   public static int[][] sumCols(int[][] arr){
      int[][] toReturn = new int[1][arr[0].length];
      for (int j = 0; j <arr[0].length; j++){
         int sum = 0;
         for (int i = 0; i <arr.length; i++){
            int element = arr[i][j];
            sum += element;
         }
         toReturn[0][j] = sum;
      }
      return toReturn;
   }
   
   public static int[][] sumRows(int[][] arr){
      int[][] toReturn = new int[arr.length][1];
      for (int i = 0; i <arr.length; i++){
         int sum = 0;
         for (int j = 0; j <arr[0].length; j++){
            sum += arr[i][j];
         }
         toReturn[i][0] = sum;
      }
      return toReturn;
   }
   
   public static int sumUp(int[][] arr){
      int sum = 0;
      for(int i = 0; i < arr.length; i++){
         for (int j = 0; j <arr[0].length; j++){
            int element = arr[i][j];
            sum += element;
         }//ends inner
      }//ends outer
      return sum;
   }
   
   public static void printArray(int[][] arr){
      /*for (int i = 0; i < arr.length; i++){
         for (int j = 0; j < arr[0].length; j++){
            int element = arr[i][j];
            System.out.print(element + ", ");
         } //ends my inner for loop
         System.out.println();//go to the next line
      }//ends my outer for loop*/
            for (int[] row : arr2D){
         for (int element : row){
            System.out.print(element + ", ");
         }
         System.out.println();
      }
   }
   
   public static void printStrArray(String[][] arr){
       for (int i = 0; i < arr.length; i++){
         for (int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + ", ");
         } //ends my inner for loop
         System.out.println();//go to the next line
      }
   }
}