import java.util.Scanner;
class months
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  int date;
  System.out.println("Enter any date.."); 
  date = sc.nextInt();

switch(date)
{
 case 29:
     System.out.println("February");
 break;

 case 30:
     System.out.println("April, June, September, November");
 break;

 case 31:
     System.out.println("Janurary, March, May, July, August, October, December");
 break;

default: 
     if(date < 1 || date > 31)
       {
        System.out.println("Invalid date..");
       }
     
     else if(date > 0 || date < 29)
       {
        System.out.println("ye to sabme aati hai");
       }
    
       
}
}
}

 