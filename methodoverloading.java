//method overloading
    //isme same naam k do functions bana skte hein lekin dono methods m kuch conditions honi chaiye, jaise
    // 1. both methods should have different datatypes if the no. of arguments is same
    // 2. both methods should have different no. of variables if datatype is same
public class methodoverloading {
  public static void main(String[] args) {
    
    //first function
    fun(12);

    //second function
    fun("Nayan"); 

    //third function
    int ans = sum(4,3);
    System.out.println("third fn.");
    System.out.println(ans);
    System.out.println("");

    //fourth function
    int ans_2 = sum(2, 4, 6);
    System.out.println("fourth fn.");
    System.out.println(ans_2);

  }

    //first function
    static void fun(int a){
    System.out.println("first fn.");
    System.out.println(a);
    System.out.println("");
  }

    //second function
    static void fun(String name) {
    System.out.println("second fn.");  
    System.out.println(name);
    System.out.println("");
  }

    //third function
    static int sum(int a, int b)
    {
      return a + b;
    }

    //fourth function
    static int sum(int a, int b, int c)
    {
      return a + b + c;
    }
}
