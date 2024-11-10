//import java.util.Arrays;
public class sortingofarray {
  public static void main(String[] args) {
    int temp =0;
    int a[] = {2,5,0,12,56,3};
    for(int i=0; i<5; i++)
    {
      for(int j=i+1; j<5-i; j++)
      {
        if(a[i]>a[j])
        {
         temp = a[j];
         a[i] = a[j];
         a[i] = temp;
        }
      } 
    }
    for(int x:a)
      {
        System.out.print(x + " ");
      }
}
}
