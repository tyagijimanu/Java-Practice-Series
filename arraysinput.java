import java.util.Scanner;
public class arraysinput {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int[] a = new int[10];
   
   System.out.println("Enter values of the array..");
   for(int i=0; i<10; i++)
   {
    a[i] = sc.nextInt();
   }
   for(int i=0; i<10; i++)
   {
    System.out.print(a[i]);
    System.out.println(i);
   }
   
   

  }
  
}
