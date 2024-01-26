public class last_occurance {
    public static int Loccuraace(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        //kaam
        int isFound=Loccuraace(arr, key, i+1);
        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound; 


    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,1,0,2,5,3};
        System.out.println(Loccuraace(arr, 5, 0));
    }
    
}
