interface sample
{
  void show();
}
public class lambdaexpression 
{
  public static void main(String[] args) 
  {
    sample s = () ->
    {
      System.out.println("first lambda expression");
    };
    s.show(); 
  }  
}
