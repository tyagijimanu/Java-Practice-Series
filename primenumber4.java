public class primenumber4 {
  public static void main(String[] args) {
    int num = 29  ;
    boolean isPrime = true;

    if(num < 2)
    {
      isPrime = false;
    }

    for(int i=2; i<Math.sqrt(num) ; i++)
    {
      if(num%i == 0)
      {
        isPrime = false;
        break;
      }
    }
    
    String result = isPrime ? " is a prime number" : " is not a prime number.";
    System.out.println(num + result);
  }
  
}
