interface sample
{
  void show();
}
public class anotherlambdaexpression 
{
  public static void main(String[] args) {
    sample s1 = () ->
    {
      int a,b,c;
      a=10;
      b=-10;
      c=a-b;
      System.out.println("answer = "+c);
    };
    s1.show();
  }  
}
