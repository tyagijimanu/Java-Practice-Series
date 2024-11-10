import java.util.Scanner;

class electricity
{
  public static void main(String [] args)
  {
    System.out.println("Press enter to show electricity bill");
   
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    double elecunits;
    System.out.println("Enter units: ");
    elecunits = sc.nextDouble();

    double finalbill =  elecunits * 10;
   
      if(elecunits >=100)
        {
          System.out.println("Your Bill is: " + finalbill);
        }     
      else
        {
          System.out.println("Your Bill is: 100");
        }
  }
}