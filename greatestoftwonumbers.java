import java.util.Scanner;

public class greatestoftwonumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double temp;

    //ternary operator laga rhe hein
    //(condition) ? (if true: Action) : (if false: Action)

    // System.out.println(a>b ? "a is greater than b" : "b is greater than a");
    
    //another way of writing ternary operator

    if(a==b)
    {
      System.out.println("a and b are equal.");
    }

    else 
    {
      temp = a > b ? a : b;
      /*
      iska matlab hai ki

      if (a > b) 
      {
        temp = a;
      } 
      else 
      {
        temp = b;
      } 
        */
      System.out.println(temp + "is the largest number");
    }
    sc.close();
  }
  
}
