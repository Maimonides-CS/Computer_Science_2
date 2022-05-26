import java.util.*; 

/*
[1, 3, 2, 7, 4, 5, 6]
 [1, 3, 2, 4, 7, 5, 6]
 [1, 2, 3, 4, 7, 5, 6]
 [1, 2, 3, 4, 5, 7, 6]
 [1, 2, 3, 4, 5, 6, 7]
 [1, 2, 3, 4, 5, 6, 7]
 */

public class QuickSort {
    private static int[] AA = {1, 7, 7};
    //private static int[] AA = {2, 1};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(AA));

        quicksort(0, AA.length-1);
        
        System.out.println(Arrays.toString(AA));
    }    

    public static void  quicksort(int low, int high) {
        System.out.println("low: " +low + " high: " + high);

         if (low < high) {
            int index = partition(low, high);
            System.out.println("index: " + index);
            //if (low < index-1) {
            quicksort(low, index-1);
            //}
            //if (index <high) {
            quicksort(index, high);
            //}
            }

    }



 
    public static int partition (int left, int right) {
        System.out.println("left: " + left + " right: " + right);

        int mid = (left + right)/2;
        System.out.println("mid: " + mid);

        int i = left, j = right;
 
        while (i <= j) {

             while ( AA[mid]> AA[i]) {
                 i++;
             }
             while (AA[mid] < AA[j]) {
                 j--;
             }
          
            if (i<=j) {
              int temp = AA[i];
              AA[i] = AA[j];
              AA[j] = temp;
              i++;
              j--;
            }
 
        }
        
        System.out.println("i: " + i);
        return i;
       
 
    }
  } 
 
