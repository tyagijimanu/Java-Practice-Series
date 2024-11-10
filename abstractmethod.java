abstract class A
{
  abstract void area();
  abstract void output();
   
  void show()
  {
    System.out.println("atamaji satakli");
  }
}
class B extends A
{
  int a,b,c;
  void input()
  {
    a=10;
    b=20;
    c=30;
  }

  @Override
  void output()
  {
    System.out.println("a="+a+","+"b="+b+","+"c="+c);
  }

  @Override
  void area()
  {
    double pi,r;
    pi=3.14;
    r=3;
    System.out.println(pi*r*r);
  }
}
class abstractmethod {
  public static void main(String[] args) {
    B b1 = new B();
    b1.show();
    b1.input();
    b1.output();
    b1.area();
  }
}
