import java.util.*;
import java.util.ArrayList;

public class recursion_example {
    public static void main(String[] args) {
       recur(0);
    }
    public static void recur(int i) {
        if (i == 9) System.out.println(i);
        else {
            System.out.println(i);
            i++;
            recur(i);
        }
    }
}
