/*
Basic sorting algorithm:-

1)Bubble sort:-
      array:-{5,4,1,3,2}
      sorted:-{1,2,3,4,5}
     "Larger element come to the end of the array by swaping the adjacent elements"
*/
public class basics {
  public static void Bubble_sort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void print_array(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int marks[] = { 5, 4, 1, 3, 2 };
    Bubble_sort(marks);
    print_array(marks);
  }
}

/*
2)Selection sort:-
  "Pick the smallest (from unsorted) , put it at the begining"
  array={5,4,1,3,2}
  sorted={1,2,3,4,5}
  
*/
public class basics {

  public static void print_array(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void selection_sort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int min_pos=i;
      for(int j=i+1;j<arr.length-1;j++){
        if(arr[min_pos]>arr[j]){
          min_pos=j;
        }
      }
      int temp=arr[min_pos];
      arr[min_pos]=arr[i];
      arr[i]=temp;
    }
  }
 
  public static void main(String[] args) {
    int marks[] = { 5, 4, 1, 3, 2 };
    selection_sort(marks);
    print_array(marks);
  }
}

/*
3)Insertion sort:-
  "Pick an element(From unsorted array) and place in the right position in sorted part"
    array={5,4,1,3,2}
    sorted={1,2,3,4,5}
      
      5->sorted  4,1,3,2->unsorted
      4,5->sorted  1,3,2->unsorted
      1,4,5->sorted  3,2->unsorted
      1,3,4,5->sorted  2-unsorted
      1,2,3,4,5 -->sorted
*/

public class basics {

  public static void print_array(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertion_sort(int arr[]){
    for(int i=1;i<arr.length;i++){
      int curr=arr[i];
      int prev=i-1;
      while(prev>=0 && arr[prev]>curr){
        arr[prev+1]=arr[prev];
        prev--;
      }
      arr[prev+1]=curr;

    }
  }
  public static void main(String[] args) {
    int marks[] = { 5, 4, 1, 3, 2 };
    insertion_sort(marks);
    print_array(marks);
  }
}

/*
4)Inbuilt sort:-
 import java.util.Arrays;
 Arrays.sort(arr);
 
 Arrays.sort(arr,si,ei);
 
 ->To print in decending order:-
    import java.util.Collections;
    Arrays.sort(arr,Collections.reverseOrder());
      Integer arr[]={5,4,1,2,3}
      ->work on object.
 */
 import java.util.Arrays;
public class basics {
  public static void main(String[] args) {
    int marks[] = { 5, 4, 1, 3, 2 };
    Arrays.sort(marks);
    print_array(marks);
  }
 }
 
 
 /*
 5)Counting sort:-
      
 */
 
*/
