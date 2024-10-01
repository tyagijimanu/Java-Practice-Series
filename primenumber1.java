public class primenumber1 {
  public static void main(String[] args) {
    int n = 13;
    int no_of_multiple = 0;

    if(n<2)
    {
      System.out.println(n + " is not prime number.");
    }

    for(int i=2; i<n; i++)
    {
      if(n%i == 0)
      {
        no_of_multiple = no_of_multiple + 1;
      }
    }

    String result = no_of_multiple > 0 ? " is not prime" : " is prime";
    System.out.println(n + result);

    }
  }
  

