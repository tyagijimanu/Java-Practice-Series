abstract class A
{
  void show()
  {
    System.out.println("Abstract Class");
  }
}
class B extends A
{
  void demo()
  {
    System.out.println("Non-Abstract Class");
  }
}
class abstractclass2 {
  public static void main(String[] args) {
    B b1 = new B();
    b1.show();
    b1.demo();
  }
  
}
