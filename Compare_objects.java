import java.util.*;
import java.util.concurrent.TimeUnit;

public class Compare_objects {

  // Call the constructor
  public static void main(String[] args) throws InterruptedException {

    Date d1 = new Date();
    //TimeUnit.SECONDS.sleep(1);
    //Thread.sleep(1000);
    Date d2 = new Date();
    //System.out.println("d1.toString(): " + d1.toString());
    System.out.println("d1: " + d1);
    System.out.println("d2: " + d2);
    //System.out.println(d1.equals(d2));
    System.out.println(d1==d2);
  }
}
