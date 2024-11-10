import java.util.Scanner;
class si
{
  public static void main(String [] args)
  {
    System.out.println("Finding Simple Interest by taking values from the user:");

    Scanner sc = new Scanner(System.in);
    double p;
    double r;
    double t;

    System.out.println("Enter value for P:");
     p = sc.nextDouble();

    System.out.println("Enter value for R:");
     r = sc.nextDouble();

    System.out.println("Enter value for T:");
     t = sc.nextDouble();

    double simpleinterest = p * r * t / 100;
    System.out.println("Simple Interest = " + simpleinterest);
    }
}


    