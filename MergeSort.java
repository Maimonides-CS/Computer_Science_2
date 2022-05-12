import java.util.*; 

public class MergeSort {
    private int[] input = new int[]{3, 2, 1, 0, 6, 7, 4, 5};
    private int[] temp = new int[8];
    public static void main(String[] args) {
        
       MergeSort instance = new MergeSort();
       instance.divide(0, 7);
       System.out.println(Arrays.toString(instance.input));

    }

    public void Combine(int low, int middle, int high) {
      
      for (int i = low; i<= high; i++) {
        temp[i] = input[i];
      }

      // int i: index of the left subarray 
      // int j: index of the right subarray
      // int z: index of the combined array
      int i = low, j = middle +1, z = low;
      //z <= high
      while ((i <= middle)&&(j <= high)) {

          if (this.temp[i] < this.temp[j]) {
            input[z] = temp[i];
             i++;
          }
          else {
            input[z] = temp[j];
            j++;
          }
          z++;
      }
      while (i <= middle) {
        input[z] = temp[i];
        i++;
        z++;
      }

      while (j <= high) {
        input[z] = temp[j];
        j++;
        z++;
      }

    }

    public void divide (int low, int high) {
         if (low < high) {
            int mid = (high+low)/2;
            divide(low, mid);
            divide(mid+1, high);
            Combine(low, mid, high);
         }

    }


}
