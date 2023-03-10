/*
ARRAYS:-
      Array is defined as the list of elements of the same data type placed in a contiguous memory location
 eg:-Three subject marks
  98  99  82
   its starting addreess is 1000 then 1004,1008 because int is of 4 bytes
   
Operators in Array:-
  1) Create:-
  2)Input:-
  3)Output
  4)Update:-
*/
/*
1)Create:-
data_type arrat_name[]=new data_type[size];

example:-
        int marks[]=new int[50];
        int number={1,2,3,4};
        int moreNum={5,6,7,8};
        String fruits={"apple","mango","orange"};

2)Input:- 
     -> input can be taken from the user by first taking n as an size of array and then run loop from o to n and taking value as input 
3)Output:-
     -> output can be given by running a loop from 0 to n and print each element present at specific address.
*/  
//Code:-
import java.util.Scanner;

public class basics {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enetr the size of array:"); 
      int n=sc.nextInt();                               //input size of array
      int arr[]=new int[n];                             // create array
      System.out.println("Enter the elements in the array:");
      for(int i=0;i<n;i++){                              // input of arrary
         arr[i]=sc.nextInt();
      }
      System.out.println("the elements in array are:");
      for(int i=0;i<n;i++){                               // output of elements in array
         System.out.print(arr[i]+" ");
      }
      sc.close();
    
   }
}

/*
NOTE:- We can check or print the length of array
       ->System.out.println("length of array is:"+array.length);
*/
/*
4)Update:-
     we can update the value in array 
     eg:-marks[2]*=100;
         System.out.println("Maths:"+marks[2]);
 */
 //passing array as argument:-
 //pass by value main ERROR
 //pass by reference main CORRECT
 
 import java.util.Scanner;

public class basics {
   public static void update(int marks[],int non_changable){
    non_changable=10;        // value will be only for this finction cannot be passed to main function
    for(int i=0;i<marks.length;i++){     //updates the value of array
      marks[i]=marks[i]+1;
    }
   }
   public static void main(String[] args) {
      int marks[]={97,98,99};
      int non_changable=5;
      update(marks, non_changable);
      System.out.println(non_changable);     // value will be 5 only will not change 
      for(int i=0;i<marks.length;i++){        // array value will be changed incremented by 1 
         System.out.print(marks[i]+" ");
      }
      System.out.println();
    
   }
}
