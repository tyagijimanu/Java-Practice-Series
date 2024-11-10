import java.util.Scanner;

class compareage
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
     double ram, shyam;

    System.out.println("Enter age of Ram:");
     ram = sc.nextDouble();

    System.out.println("Enter age of Shyam:");
     shyam = sc.nextDouble();
 
    if(ram > shyam)
      {
        System.out.println("Ram is elder brother");
      }
    else
      {
        System.out.println("Shyam is elder brother");
      }
       
        sc.close();
  }
}