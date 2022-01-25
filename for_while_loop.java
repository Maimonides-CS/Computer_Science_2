import java.io.*;
import java.util.*;

public class for_while_loop {
  public static void main(String[] args) {

   /* 
  int i =1, mult3 = 3; 
   while (mult3 < 20) {
     System.out.println(mult3 + "");
     i++;
     mult3 *= i;
   }*/

   
   for (int i = 1, mult3 =3; mult3 < 20; i++, mult3 *=i ) 
       System.out.println(mult3);

   }
}
