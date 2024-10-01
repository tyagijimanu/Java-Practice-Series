public class primenumber {
  public static void main(String[] args) {
    int number = 29;

    //shuru m number of multiples ko 0 mano 
    int no_of_multiples = 0;

    // kyonki negative numbers, 0 aur 1 prime number nhi hote
    //isiliye
    if(number < 2)
    {
      System.out.println(number + " is not a prime number.");
      System.exit(0);
    }

    //yahan ham number ko 1 se lekar us number tak divide krke check krenge ki remainder 0 aa rha h ki nhi
    //mtlb wo uska multiple h
    //agr remainder 0 aata h toh "no_of_multiple" mein 1 add ho jayega 
    for(int i=1; i<=number; i++)
    {
      if(number%i == 0)
      {
        no_of_multiples =+ 1;
      }
    }

    //since prime number k sirf 2 he factors hote hein toh agr "no_of_multiple" ki value 2 ayegi toh wo prime number h 
    //agar number of multiples ki value 2 se jada aati h mtlb uske 2 se jayda factors hein that's why wo prime nhi hoga fir
      if(no_of_multiples == 2)
      {
        System.out.println(number + " is a prime number.");
      }
      else
      {
        System.out.println(number + " is not a prime number.");
      }

    }
    
  }
    
  

