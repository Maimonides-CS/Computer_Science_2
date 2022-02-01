public class Constructor_this {
  int x = 6;

  // Constructor with a parameter
  public Constructor_this(int x) {
    this.x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    Constructor_this myObj = new Constructor_this(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
