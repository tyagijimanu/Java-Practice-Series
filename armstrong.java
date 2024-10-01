//printing all armstrong number from 1 to 999
public class armstrong {
  public static void main(String[] args) {

      for(int i=1; i<1000; i++)
      {
        if(isArmstrong(i))
        {
          System.out.println(i + "");
        }
      }
  }

    static boolean isArmstrong(int n){
      int original = n;
      int sum = 0;
      while(n > 0){
              int rem = n % 10;
              sum = sum + rem*rem*rem;
              n = n / 10;
      }          
      return sum == original;
  }
}

