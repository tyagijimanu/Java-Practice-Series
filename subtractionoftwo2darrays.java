public class subtractionoftwo2darrays {
  public static void main(String[] args) {
    int a[][] = {{1,4,8},{0,89,61}};
    int b[][] = {{10,20,43},{24,25,63}};
    int i,j;
    for(i=0; i<2; i++ )
    {
      for(j=0; j<2; j++)
      {
        System.out.print(a[i][j] - b[i][j] + " ");
      }
      System.out.println();
    }
  }
  }
  

