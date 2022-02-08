import java.util.*;
import java.util.concurrent.TimeUnit;

public class Compare_Name {
  // Call the constructor
  private int x;
  private String y;
  public Compare_Name(int x, String y) {
    this.x = x;  // Set the initial value for the class attribute x
    this.y = y;
  }

  public boolean equals(Compare_Name name3)
  {
    if (this.x!=name3.x) return false;
    return true;
  }
  public static void main(String[] args)  {
    Compare_Name name1= new Compare_Name(1, "hello");
    Compare_Name name2= new Compare_Name(2, "hello");
    System.out.println(name1.equals(name2));
  }
}
