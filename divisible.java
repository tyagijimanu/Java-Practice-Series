public class divisible 
{
  public static void main(String[] args) 
  {
    for(int i=1; i<=100; i++)
    {
      if(i%5==0 && i%10==0 && i%15==0 && i%20==0)
      {
      System.out.println(i);
      }  
  
    }
  }
}