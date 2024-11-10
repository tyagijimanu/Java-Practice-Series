public class diagonalmatrix {
  public static void main(String[] args) {
    int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
    int i,j;
    for(i=0; i<3; i++)
    {
      for(j=0; j<3; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Sum of diagonal elements is: ");
    System.out.print(a[0][0] + a[1][1] + a[2][2]);
  }
  
}
