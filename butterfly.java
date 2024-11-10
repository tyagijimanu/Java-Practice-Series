public class butterfly {
  public static void main(String[] args) {
    int i, j, k;
    
    for(i=1; i<=5; i++)
    {
      //j ki value k liye
      for(j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      //spacing k liye
      for(k=5; k>=i; k--)
      {
        System.out.print(" ");
      }
      for(k=4; k>=i; k--)
      {
        System.out.print(" ");
      }
      //dobara j ki value k liye
      for(j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

    for(i=4; i>0; i--)
    {
      for(j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      for(k=5; k>=i; k--)
      {
        System.out.print(" ");
      }
      for(k=4; k>=i; k--)
      {
        System.out.print(" ");
      }
      for(j=1; j<=i; j++)
      {
        System.out.print("*");
      }
        System.out.println();
    }

  }

}
