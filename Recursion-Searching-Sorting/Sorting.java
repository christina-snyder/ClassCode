public class Sorting{
   public static void main(String[] args){
   int size = 10;
      int[] arr = new int[size];
      for (int i = 0; i<size; i++){
         arr[i] = (int) (Math.random() * 10);
      }
      printArray(arr);
      //BubbleSort(arr);
      InsertionSort(arr);
      //SelectionSort(arr);
      //QuickSort(arr, 0, arr.length-1);
      printArray(arr)
   }
   
   public static void QuickSort(int[] arr, int fakeStart, int fakeEnd){
      int i = fakeStart;
      int j = fakeEnd;
      int pivotIndex =  (i+j)/2;
      int pivot = arr[pivotIndex];
      while (i <= j){
         //swaps so that left side to be less than pivot and right is greater than pivot
         while (arr[j] > pivot){
            j--;
         }   
         
         while (arr[i] < pivot){
            i++;
         }
         if (i <= j){
            swap(arr, i, j);
            i++;
            j--;
         }
      }
      if (j > fakeStart)
      QuickSort(arr, fakeStart, j);
      if (i < fakeEnd)
      QuickSort(arr, i, fakeEnd);
   }
   
   public static void SelectionSort(int[] arr){
      for (int i = 0; i<arr.length; i++){
         int currMin = arr[i];
         int currMinIndex = i;
         for (int j = i; j<arr.length; j++){
            if (arr[j] < currMin){
               currMin = arr[j];
               currMinIndex = j;
            }   
         }
         swap(arr, i, currMinIndex);
      }
   }
   
   public static void InsertionSort(int[] arr){
      int[] sorted = new int[arr.length];
      for (int i = 0; i < arr.length; i++){
         int thingToInsert = arr[i];
         int indexToInsert = 0;
         for (int j = 0; j<i; j++){
            if (sorted[j] <= thingToInsert){
               indexToInsert++;
            }
         }
         insert(sorted, indexToInsert, thingToInsert);
         
      }
      
      copy(sorted, arr);
   }
   
   public static void BubbleSort(int[] arr){
      int swapCount = 1;
      for (int i = 0; i<arr.length; i++){
         if (swapCount == 0) break;
         else {
         swapCount = 0;
         for (int j = 0; j <arr.length - i - 1; j++){
            if (arr[j+1] < arr[j]){
               swapCount++;
               swap(arr, j+1, j);
               System.out.print("Swap!: ");
               printArray(arr);
            }   //end if
         }//end for
         }//end else
         System.out.print("Biggest one bubbled!: ");
         printArray(arr);
      }//end big for
   }
   
   public static void swap(int[] arr, int i1, int i2){
      if (isValid(arr, i1) && isValid(arr, i2)){
         int temp = arr[i1];
         arr[i1] = arr[i2];
         arr[i2] = temp;
      }
   }
   
   //precondition: there is room in arr to shift things down
   public static void insert(int[] arr, int index, int thing){
      if (isValid(arr, index)){
         for (int i = arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
         }
         arr[index] = thing;
      }
   }
   
   public static boolean isValid(int[] arr, int i){
      return i>=0 && i<arr.length;
   }   
   
   public static void printArray(int[] arr){
      for (int i : arr)
         System.out.print(i + ", ");
      System.out.println();   
   }
   
      public static void copy(int[] oldData, int[] newArray){
      for (int i = 0; i<oldData.length; i++){
         newArray[i] = oldData[i];
      }   
   }
   //already sorted
   public static int[] merge(int[] arr1, int[] arr2){
      int[] toReturn = new int[arr1.length + arr2.length];
      int tRindex = 0;
      int arr1Index = 0;
      int arr2Index = 0;
      while (arr1Index < arr1.length && arr2Index < arr2.length){
         if (arr1[arr1Index] < arr2[arr2Index]){
            toReturn[tRindex] = arr1[arr1Index];
            tRindex++;
            arr1Index++;
         } else {
            toReturn[tRindex] = arr2[arr2Index];
            tRindex++;
            arr2Index++;
         }
      }
      if (arr1Index < arr1.length){
         for (int i = arr1Index; i < arr1.length; i++){
            toReturn[tRindex] = arr1[i];
         }
      } else {
         for (int i = arr2Index; i < arr2.length; i++){
            toReturn[tRindex] = arr2[i];
         }
      }
      return toReturn;
   }
   
   /* Data HAS TO be sorted */
   public static boolean binarySearch(int[] arr, int targetNumber, int fakeStart, int fakeEnd){
      int middle = (fakeStart + fakeEnd) / 2;
      if (arr[middle] == targetNumber){
         return true;
      }  else if (fakeStart >= fakeEnd){
          return false;
      } else {
         if (targetNumber < arr[middle]){
            return binarySearch(arr, targetNumber, fakeStart, middle);
         }  else {
            return binarySearch(arr, targetNumber, middle, fakeEnd);
         }
      }
   }
   
   public static boolean seqSearch(int[] arr, int targetNumber){
      for (int x : arr){
         if (x == targetNumber){
            return true;
         }
      }
      return false;
   }
}