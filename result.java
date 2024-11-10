import java.util.Scanner;

class result
{
  public static void main(String [] args)
  {
    System.out.println("Press enter to show result");
    
    Scanner sc = new Scanner(System.in);
    sc.nextLine();

    int eng;
    int hin;
    int maths;
    int sst;
    int sci;

    System.out.println("Enter marks of English:");
     eng = sc.nextInt();
     sc.nextLine();

    System.out.println("Enter marks of Hindi:");
     hin = sc.nextInt();
     sc.nextLine();

    System.out.println("Enter marks of Maths:"); 
     maths = sc.nextInt();
     sc.nextLine();

    System.out.println("Enter marks of Social Studies:");
     sst = sc.nextInt();
     sc.nextLine();

    System.out.println("Enter marks of Science:");
     sci = sc.nextInt();
     sc.nextLine();

    int total = eng + hin + maths + sst + sci;

    double percent = total/5;

    System.out.println("Total marks obtained:" + total);

    System.out.println("Press Enter to show Percentage:");
    sc.nextLine();

    System.out.println("Your Percentage is: " + percent);
    
    }
}