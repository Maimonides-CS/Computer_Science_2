import java.util.*;
import java.util.concurrent.TimeUnit;

public class Name_clone implements Cloneable{
  // Call the constructor
  private int x;
  private String y;
  public Name_clone(int x, String y) {
    this.x = x;  // Set the initial value for the class attribute x
    this.y = y;
  }

  public boolean equals(Name_clone name3)
  {
    if (this.x!=name3.x) return false;
    return true;
  }

  public Object clone() throws CloneNotSupportedException
  {
      return super.clone();
  }

  public static void main(String[] args)  throws CloneNotSupportedException {
    Name_clone name1= new Name_clone(1, "hello");
    Name_clone name2= new Name_clone(2, "hello");
    Name_clone name4 = (Name_clone) name2.clone();
    System.out.println(name1.equals(name2));
  }
}

