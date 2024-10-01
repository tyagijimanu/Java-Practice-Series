import java.util.Arrays;
import java.util.Scanner;

public class arraytostring {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //int[] arr = new int[5];

    //for(int i=0; i<arr.length; i++)
    //for(int i : arr)
    //for each element in the array "arr", print the element
    //here i represent the element of the array
    //{
      //arr[i] = sc.nextInt();
    //}

    //for(int j=0; j<arr.length; j++)
    //for(int j : arr)
    
      //System.out.println(Arrays.toString(arr));
      //Arrays is a predefined class in java which contains ".toString()" method
      //when we give anything into the method's parenthesis it will convert into string
      //here we have given an array "arr"
  

      String[] string = new String[5];
      for(int j=0; j<string.length; j++)
      {
        string[j] = sc.nextLine();
      }

      System.out.println(Arrays.toString(string));
      //yahan pr "string" naam k array ko ".toString" naam k method m pass kiya h, keeping in mind that square bracket nhi likhenge jab pass krenge

  sc.close();
}
  
}
