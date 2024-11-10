public class mergingoftwoarrays {
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int b[] = {6,7,8,9,10};
    int c[] = new int[10];
    int i=0,j,k;
    for(j=0; j<5; j++)
    {
      c[i] = a[j];
      i++;
    }
    for(k=0; k<5; k++)
    {
      c[i] = b[k];
      i++;
    }
    for(int x:c)
    {
      System.out.print(x);
    }
  }
  
}
