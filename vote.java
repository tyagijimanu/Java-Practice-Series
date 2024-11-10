import java.util.Scanner;
class vote
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  double age;
  System.out.println("Enter your age:");
  age = sc.nextDouble();

if(age >= 18)
 {
  System.out.println("You are eligible to vote.");
 }
else
  {
    System.out.println("You are not eligible to vote");
  }

sc.close();
}
}