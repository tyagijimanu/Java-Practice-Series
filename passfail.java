import java.util.Scanner;
class passfail
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);

  System.out.println("Press enter to show result");
  sc.nextLine();

  double percent;
  System.out.println("Enter your percentage: ");
  percent = sc.nextDouble();
  
  if (percent >= 33.33)
   {
    System.out.println("You are pass.");
   }
  else
   {
    System.out.println("You are fail.");
}
}
}
