import java.util.Arrays;

public class secondlargestinarray {
  public static void main(String[] args) {

     int arr[] = new int[]{2,5,8,1,45,745};
     //we have to find second largest element in the array
     //but we have to sort the array
     for(int i=0; i<arr.length-1; i++)
     {
      if(arr[i]<arr[i+1])
      {
        arr[i] = arr[i+1];
      }
     }
     System.out.println(Arrays.toString(arr));
  }
  
}
