import java.util.Scanner;
public class sortarray {
  public static void main(String[] args) {
    int temp=0;
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int array1[] = new int[n];

    System.out.println("Enter all the elements of the array:");
    for(int i=0; i<n; i++)
    {
      array1[i] = sc.nextInt();
    }
    
    System.out.println("Original Array:");
    for(int i=0; i<n; i++)
    {
      System.out.print(array1[i] + " ");
    }

    System.out.println("");
    System.out.println("");

    System.out.println("Sorted array:");
    for(int i=0; i<n; i++)
      {
        for(int j=i+1; j<n; j++ )
          {
            if(array1[i] > array1[i+1])
            {
              temp = array1[i];
              array1[i] = array1[i+1];
              array1[i+1] = temp;
            }
          }
          System.out.print(array1[i] + " ");
      }

    // for(int i=0; i<n; i++)
    // {
    //   System.out.println(array1[i] + " ");
    // }
    sc.close();
  }
}
