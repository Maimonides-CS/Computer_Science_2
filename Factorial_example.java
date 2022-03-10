import java.util.*;
import java.util.ArrayList;

public class Factorial_example {
    public static void main(String[] args) {
        int n=4; 
        System.out.println("result: " + factorial(n));
        int result=1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        System.out.println("for loop result: " + result);
    }
    public static int factorial(int n)
    {
        if (n == 0) //base case
          return 1;
        else
           return n * factorial(n - 1);
    }
}
