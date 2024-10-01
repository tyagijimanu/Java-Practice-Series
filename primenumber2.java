//isme ham check krenge ki n 2 se lekar n-1 tak kisi bhi value se completly divide ho rha ya nhi agr hota h toh prime nhi h
public class primenumber2 {
  public static void main(String[] args) {

    int n = 20;
    boolean isPrime = true;
    //Yeh part simply kuch variables ko initialize kar raha hai (i, n, aur isprime). Yeh operation constant time (O(1)) mein hota hai kyunki chahe n ki value kuch bhi ho, hamesha yeh line ek hi bar execute hogi.
    //therefore T C = O(1)

    if(n<2)
    {
      isPrime = false;
    }
    //Yeh if statement ek simple comparison kar raha hai: "Kya n ki value 2 se chhoti hai?"
    //Yeh comparison operation constant time (O(1)) mein hota hai, kyunki yeh sirf ek comparison hai. Chahe n ki value kuch bhi ho, yeh comparison ek hi operation mein khatam ho jayega.
    //Iska matlab hai ki n ki value badhne ya kam hone se yeh comparison jaldi ya der mein nahi hoga, yeh humesha ek hi fixed time leta hai.

    for(int i=2; i<n; i++)
    {
      if(n%i == 0)
      {
        isPrime = false;
        //agr ye ek bar bhi false hua toh aage check krne ki jrurat nhi h kyonki jis range m loop chal rha h usme n ko kisi bhi number se completely divide nhi hona chaiye
        break;
        //break se yhi rok denge statement ko
      }
    }
    //worst case scenario m iski time complexity O(n) hogi
    //kyonki agr n ki value badi hui, toh loop i=2 se i=n-1 tak chalega
    //Constant Space: Loop ke andar koi bhi extra data structure ya variable nahi ban raha hai jo input size ke saath grow karta ho. Isliye, space complexity O(1) hai.

    //agar isPrime true ya false h toh result ki value ternary operator k hisab se hogi
    String result = isPrime ? " is a prime number." : " is not a prime number.";
    System.out.println(n + result);//fir result ko print kr denge
  }
}
