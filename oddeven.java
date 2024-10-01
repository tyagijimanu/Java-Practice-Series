public class oddeven {
 public static void main(String[] args) {

  int num=6-3-4-5-6-7+50;
  // if(num%2==0)
  // {
  //   System.out.println("the number is even");
  // }
  // else
  // System.out.println("the number is odd");
  

  //using ternary operator
  String number = num%2==0 ? " is even" : " is odd";
  System.out.println(num + number);
 } 
}
