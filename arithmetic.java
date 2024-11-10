import java.util.Scanner;
class arithmetic
{
 public static void main(String [] args)
{
 Scanner sc = new Scanner(System.in);
 int a, b;
 char op;
 System.out.println("Enter first integer..");
 a = sc.nextInt();
 System.out.println("Enter second integer..");
 b = sc.nextInt();
 System.out.println("Enter any arithmetic operation..");
 op = sc.next().charAt(0);

switch(op)
{
 case '+':
    System.out.println("Since operation is a plus, your answer is " + (a+b));
break;

case '-':
    System.out.println("Since operation is a minus, your answer is " + (a-b));
break;

case '*':
    System.out.println("Since operation is a multiplication, your answer is " + (a*b));
break;

case '/':
    System.out.println("Since operation is a division, your answer is " + (a/b));
break;

default:
    System.out.println("Invalid input");
}
}
}