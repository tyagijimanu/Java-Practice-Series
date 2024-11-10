import java.util.Scanner;
class average
{
  public static void main(String [] args)
  {
   System.out.println("Finding Average of three numbers by taking values from the user, press Enter to continue:");
    
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
   
    int p;
    int q;
    int r;

System.out.println("Press Enter to find average:");
sc.nextLine();
 
System.out.println("Enter first value:");
p = sc.nextInt();
 
System.out.println("Enter second value:");
q = sc.nextInt();
 
System.out.println("Enter third value:");
r = sc.nextInt();

int avg = (p + q + r)/3;

System.out.println("The average is:" + avg);
sc.close();
}
}
