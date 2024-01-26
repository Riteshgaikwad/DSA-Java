//check if a given array is sorted or not 
public class array_sorted {
  public static boolean isSorted(int arr[],int i){
    // base case 
    if(i==arr.length-1){
      return true;
    }
    //kaam
    if(arr[i]>arr[i+1]){
      return false;
    }
    //inner call  function
    return isSorted(arr, i+1);
  }
  public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    System.out.println(isSorted(arr, 0));
  }   
}
