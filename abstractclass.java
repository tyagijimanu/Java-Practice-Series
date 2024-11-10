abstract class A
{
  static void show()
  //agr yahan static nhi likhenge toh neeche wale class m isko inherit krna pdega
  {
    System.out.println("Abstract Class");
  }
}
class B//isko "class B extends A" likhna pdta
{
  void demo()
  {
    System.out.println("Non-Abstract Class");
  }
}
class abstractclass {
  public static void main(String[] args) {
    B b1=new B();
    A.show();
    //kyonki show method static hai isiliye usko class k naam se he call kr liya
    b1.demo();
    //ye wala static nhi h isiliye object se call kiya
  }
}
