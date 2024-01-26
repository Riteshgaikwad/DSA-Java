//Write a function to find the first occurence of an element in an array 
public class first_occurance {
    public static int Occurance(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        //kaam
         if(arr[i]==key){
            return i;
         }
         // inner call function
         return Occurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(Occurance(arr, 5, 0));
    }
    
}
