public class positivenegative 
{
  public static void main(String[] args) 
  {
    int n=9-5;
    //using normal if else conditional statements

  //   if(n<=0)
  // {
  //    if(n==0)
  //   {
  //     System.out.println("n is zero");
  //   }
  //   else 
  //   {
  //     System.out.println("n is negative");
  //   }
  //   else
  //   {
  //     System.out.println("n is positive");
  //   }

  //using ternary operator
  String num=n>0 ? ("n is positive") : ("n is negative");
  System.out.println(num);
}
}


