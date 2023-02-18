/*
Find the Largest and Smallest number in array
 array:-1,2,6,3,5
      -infinity=Inteher.MIN_VALUE;
      +infinity=Integer.MAX_VALUE; 
*/
import java.util.Scanner;

public class basics {
  public static void largest_smallset(int arr[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(largest<arr[i]){
         largest=arr[i];
      }
      if(smallest>arr[i]){
         smallest=arr[i];
      }
    }
    System.out.println("Largest element is:"+largest);
    System.out.println("Smallest element is:"+smallest);

  }
   public static void main(String[] args) {
      int marks[]={1,2,6,3,5};
      largest_smallset(marks);
    
   }
}

/*
Q:-Reverse an array 

 array:-2,4,6,8,10 output:-10,8,6,4,2
 
*/
import java.util.Scanner;

public class basics {
  public static void reverse_array(int arr[]){
    int first=0;
    int last=arr.length-1;
    while(first<last){
      int temp=arr[last];
      arr[last]=arr[first];
      arr[first]=temp;
      first++;
      last--;
    }

  }
   public static void main(String[] args) {
      int marks[]={1,2,6,3,5};
      reverse_array(marks);
      for(int i=0;i<marks.length;i++){
         System.out.print(marks[i]+" ");
      }
   }
}

/*
Q:-pairs in an array
 array:- 2,4,6,8,10
       2,4  2,6  2,8  2,10
       4,6  4,8  4,10
       6,8  6,10
       8,10
       
*/
code:-
public class basics {
  public static void pairs_in_array(int arr[]){
    int total_pair=0;
    for(int i=0;i<arr.length;i++){
      int start=arr[i];
      for(int j=i+1;j<arr.length;j++){
        System.out.print("("+start+","+arr[j]+")");
        total_pair++;
      }
      System.out.println();
    }
    System.out.print(total_pair);
  }
   public static void main(String[] args) {
      int marks[]={2,4,6,8,10};
     pairs_in_array(marks);
     
   }
}

/*
Q:print subarray in array
array:- 2,4,6,8,10
      2  2,4  2,4,6  2,4,6,8  2,4,6,8,10
      4  4,6  4,6,8  4,6,8,10
      6  6,8  6,8,10
      8  8,10
      10
*/
code:-
public class basics {
  public static void pairs_in_array(int arr[]){
    int total_pair=0;
    for(int i=0;i<arr.length;i++){
      int start=i;
      for(int j=i;j<arr.length;j++){
        int end=j;
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        total_pair++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.print(total_pair);
  }
   public static void main(String[] args) {
      int marks[]={2,4,6,8,10};
     pairs_in_array(marks);
     
   }
}
/*
Q:-Maximum subarray sum (kadane's Algorithm):-
*/
public class basics {
 public static void kadans_algorithm(int arr[]){
  int ms=Integer.MIN_VALUE;
  int cs=0;
  for(int i=0;i<arr.length;i++){
    cs=cs+arr[i];
    ms=Math.max(cs, ms);
    if(cs<0){
      cs=0;
    }
  }
  System.out.println("Our Maximum subarray sum is:"+ms);
 }
   public static void main(String[] args) {
      int marks[]={-2,-3,4,-1,-2,1,5,-3};
     kadans_algorithm(marks);
     
   }
}
