import java.util.Scanner;  
public class greatestamongthreeno {             
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a==b && b==c)
       {
         System.out.println("All are equal");
       }

    else if(a>b && a>c)
      {
        System.out.println("a is the greatest among all");
      }

    else if(b>a && b>c)
      {
        System.out.println("b is greatest among all");
      }
    
    else 
      {
        System.out.println("c is greater among all");
      }
    
    sc.close();
  }
}
