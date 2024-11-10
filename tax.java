import java.util.Scanner;
class tax 
{
public static void main(String [] args) 
{
 Scanner sc = new Scanner(System.in);
 int salary;
 String gender;

 System.out.println("Tax Calculator");
 System.out.println("Press enter to calculate your tax");
 sc.nextLine();
 
 System.out.println("What's your gender?");
 gender = sc.nextLine();

 System.out.println("What's your salary?");
 salary = sc.nextInt();


      if(gender.equals("male")) 
     {
      if (salary >=25000)
       {
        System.out.println("10% tax will be levied.");
       }
     }
       else if(gender.equals("female"))
            {
             if (salary >=25000)
             {
              System.out.println("20% tax will be levied");
             }
    }
}
   else
   {
    System.out.println("No tax will be levied");
   }
   sc.close();
 }
}



