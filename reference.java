public class reference {
    public static void main(String[] args) {
      int[] a= {1, 2, 3, 4};
      //int[] b=a;
      
      int[] b=new int[a.length];
      for (int i=0; i<a.length; i++) {
         b[i]=a[i];
      }
      a[2]= 5;
      System.out.println("a[2]: " + a[2]);
      System.out.println("b[2]: " + b[2]);
    }
  }
