//using ternary operators
import java.util.Scanner;

public class greatestamongthreeno1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int temp, result;
    //ternary operator
    //(condition) ? (if true: Action) : (if false: Action)

    temp = a>b ? a:b;//if a>b then temp = a else temp = b
    result = temp > c ? temp : c;
    System.out.println(result + " is the greatest.");
    
    sc.close();
  }
  
}
