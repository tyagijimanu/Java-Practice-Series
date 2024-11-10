public class verticalhalfbutterfly {
  public static void main(String[] args) {
    //upper erect triangle
    for(int i=1; i<=5; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    //lower inverted triangle with 4 levels
    for(int i=1; i<=5; i++)
    {
     for(int j=4; j>=i; j--)
      {
        System.out.print("*");
      }
       System.out.println();
    }

  }
}
