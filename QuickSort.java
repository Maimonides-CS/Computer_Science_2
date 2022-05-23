/*
[1, 3, 2, 7, 4, 5, 6]
 [1, 3, 2, 4, 7, 5, 6]
 [1, 2, 3, 4, 7, 5, 6]
 [1, 2, 3, 4, 5, 7, 6]
 [1, 2, 3, 4, 5, 6, 7]
 [1, 2, 3, 4, 5, 6, 7]
 */

public class QuickSort {
    private static int[] AA = {1, 3, 2, 7, 4, 5, 6};
 
    public static void main(String[] args) {

        quicksort(0, AA.length-1);
 
    }    

    public static void  quicksort(int low, int high) {
        if (low<high) {
            int index = partition(low, high);
            quicksort(low, index);
            quicksort(index+1, high);
        }

    }



 
    public static int partition (int left, int right) {
        int mid = (left + right)/2;
 
        int i = left, j = right;
 
        while (i < j) {

             while ( AA[mid]> AA[i]) {
                 i++;
             }
             while (AA[mid] < AA[j]) {
                 j--;
             }
          
            if (i<j) {
              int temp = AA[i];
              AA[i] = AA[j];
              AA[j] = temp;
              i++;
              j--;
            }
 
        }

        return i;
       
 
    }
  } 
 
