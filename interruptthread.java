class A extends Thread
{
  public void run()
  {
    try
    {
      for(int i=1; i<=5; i++)
      {
        System.out.println(i);
        Thread.sleep(1000*i); 
      }
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
  }
}
public class interruptthread 
 {
  public static void main(String[] args) {
    A a1 = new A();
    a1.start();
    //a1.interrupt();
  } 
 }
 