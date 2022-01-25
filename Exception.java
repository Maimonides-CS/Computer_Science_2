import java.io.*;
import java.util.*;

public class Exception {
  public static void main(String[] args) {
    setRadius(9);

   }
   public static void setRadius(int newRadius)
   {
   if (newRadius < 0)
   throw new IllegalArgumentException
   ("Radius cannot be negative");
   else
   radius = newRadius;
   
   }


}
