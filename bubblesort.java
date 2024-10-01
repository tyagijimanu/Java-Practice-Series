public class bubblesort {
  public static void main(String[] args) {
    int arr[] = new int[]{22,4,66,8,9,12};
    int temp = 0;
    int largest_2nd = 0;
    for(int i=0; i<arr.length; i++)
    {
      for(int j=i+1; j<arr.length; j++)
      if(arr[i] > arr[j])
      {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    for(int i=arr.length-2; i>=0; i--)
      {
        if(a[i] != )
      }

    for(int i=0; i<arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
