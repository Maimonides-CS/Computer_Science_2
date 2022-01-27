// Import the HashMap class
import java.util.HashMap;
import java.io.*;

public class Exception {
  public static void main(String[] args) {
    setRadius(-9);
  }

  public static void setRadius(int newRadius) {
    //int radius;
    if (newRadius < 0)
    throw new IllegalArgumentException
      ("Radius cannot be negative");
    else
       System.out.println(newRadius);
      //radius = newRadius;
    }    
}
