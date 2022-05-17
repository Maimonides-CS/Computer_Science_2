/*
[1, 3, 2, 7, 4, 5, 6]

 [1, 3, 2, 4, 7, 5, 6]

 [1, 2, 3, 4, 7, 5, 6]

 [1, 2, 3, 4, 5, 7, 6]

 [1, 2, 3, 4, 5, 6, 7]

 [1, 2, 3, 4, 5, 6, 7]
 */

 public class QuickSort {
   private int[] AA = {1, 3, 2, 7, 4, 5, 6};

   public static void main(String[] args) {

   }    

   public int partition (int left, int right) {
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
      

   }
 } 

