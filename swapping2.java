import java.util.Scanner;
class swapping2
{
  public static void main(String [] args)
  {
   System.out.println("Swapping three values given by the user:");
   Scanner sc = new Scanner(System.in);
   
   int p;
   int q;
   int r;
  
System.out.println("Enter first value:");
p = sc.nextInt();

System.out.println("Enter second value:");
q = sc.nextInt();

System.out.println("Enter third value:");
r = sc.nextInt();

   p = p + q + r;
   q = p - q - r;
   r = p - q - r;
   p = p - q - r;
System.out.println("The Swapped values are: ");
System.out.println();

System.out.println("P = " + p);
System.out.println("Q = " + q);
System.out.println("R = " + r);

sc.close();
}
}


   