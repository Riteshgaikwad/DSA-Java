/*
Quesstion:-
      print factorial of a number
*/
//Solution:-

public class basic {
    
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    } 
    public static void main(String args[]){
       System.out.println(factorial(5));
    }
}

/*
Question:-
            print sum of first n natural numbers
*/
//Solution:-

public class basic {
   
    public static int nat_sum(int n){
        if(n==1){
            return 1;
        }
        int sum_n=nat_sum(n-1);
        int sum=n+sum_n;
        return sum;
    }
    public static void main(String args[]){
       System.out.println(nat_sum(5));
    }
}

/*
Question:-
           print nth fibonacci numbers
*/
//Solution:-

public class basic {
    public static int print_fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=print_fibonacci(n-1);
        int fnm2=print_fibonacci(n-2);
        int fib=fnm1+fnm2;
        return fib;
    }
    public static void main(String args[]){
       System.out.print(print_fibonacci(10));
    }
}

/*
Questions:-
      Check if a given array is sorted or not
*/
import java.util.*;

public class basic {
    public static boolean is_sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
            if(arr[i]>=arr[i+1]){
                return false;
            }
            return is_sorted(arr,i+1);
        
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        if(is_sorted(num, 0)){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}

/*
Question:-
    Write a function to find the first  occurance of an element in an array
*/
import java.util.*;

public class basic {
    public static int occurance(int array[],int target,int i){
        if(i==array.length){
            return -1;
        }
        if(array[i]==target){
            return i;
        }
        return occurance(array, target, i+1);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        System.out.println(occurance(num, 12, 0));
    }
}

/*
Question:-
    Wrie a function to find the last occurance of an element in an array
*/
import java.util.*;

public class basic {
    public static int last_occurance(int array[],int target,int i){
        if(i==array.length){
            return -1;
        }
        int isfound=last_occurance(array, target, i+1);
        if(isfound==-1 && array[i]==target){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,4,5,12,7};
        System.out.println(occurance(num, 12, 0));
        System.out.println(last_occurance(num, 12, 0));
    }
}


