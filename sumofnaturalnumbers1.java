public class sumofnaturalnumbers1 {
  public static void main(String[] args) {
      int a = 10, b = 20;

      sumofnaturalnumbers1 obj = new sumofnaturalnumbers1();

      int result = obj.add(a, b);
      
      System.out.println("Sum of " + a + " and " + b + " is: " + result);
  }

  public int add(int a, int b) {
      return a + b; // Returns the sum of 'a' and 'b'
  }
}
