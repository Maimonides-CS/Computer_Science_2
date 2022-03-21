import java.util.*;
import java.util.ArrayList;

public class fib {
    public static void main(String[] args) {
       int number=5;
       System.out.println(fib_rec(number+2));
       int[] result=new int[number+2];
       result[0] = 1;
       result[1] = 1;
       for (int i=2; i < result.length; i++) {
           result[i]= result[i-1] + result[i-2];
       }
       System.out.println(result[result.length-1]);

    }
    public static int fib_rec(int n)
    {
        if (n == 1 || n == 2)
        return 1;
        else
        return fib_rec(n - 1) + fib_rec(n - 2);
    }
}
