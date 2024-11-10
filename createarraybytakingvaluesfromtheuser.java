import java.util.Scanner;
public class createarraybytakingvaluesfromtheuser {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][]a = new int[2][2];
    int i,j;
    System.out.println("Enter values of the array:");
    for(i=0; i<2; i++)
    {
      for(j=0; j<2; j++)
      {
        a[i][j] = sc.nextInt();
      }
    } 

    System.out.println("Your matrix is:");
    for(i=0; i<2; i++)
    {
      for(j=0; j<2; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();

    }
    
  }
  
}
