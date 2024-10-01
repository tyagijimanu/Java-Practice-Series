import java.util.Scanner;
public class reversenumber {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //given values
    //we have to reverse the number
    int number = sc.nextInt();
    int reverse = 0;


    //jab tak ki number ki value 0 nhi jo jati ye loop chalta rhega
    while(number !=0)
    {     
    int remainder = number % 10;
    //number ko 10 se divide krke remainder nikalenge
    //jisse 4 mil jayega
    
    reverse = reverse * 10 + remainder;
    //sbse phle reverse ki value 0 dalenge  
    //jisse final reverse ki value 0x10 + remainder krke 4 mil jayegi aur isko reverse m assign kr denge
    //abhi reverse ki value = 4

    number = number / 10;
    //number ko 10 se divide krenge taki last m point lag jaye lekin apn ne int maana h toh floating number ko int m convert kr dega jisse last wala digit hat he jayega
    //toh abhi number ki value = 98765
    
    //since abhi number ki value 0 nhi hui h isilye loop ghoom k uper jayega while pr
    }

    System.out.println("The reversed number is = " + reverse);
    sc.close();
  }
  
  
}
