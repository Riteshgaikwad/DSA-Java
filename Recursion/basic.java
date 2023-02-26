/*
*Recursion:-
      recursion is a method of solving a computational problem where the solution depends on solution to smaller instances of the same problem
      1)Base case
      2)kaam
      3)f(n-1) (inner call)
      
      main-->function-->function-->function-->function
      
*/
/*
Question:-Print number from n to 1(decreasiong order)
*/
//Solution:-
import java.util.*;

public class basic {
    public static void print_decreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        print_decreasing(n-1);
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        print_decreasing(n);

    }
}

/*
Question:-
            print the number from n to 1 (increasing order)
*/
//Solution:-
import java.util.*;
public class basic {
    
    public static void incresasing_order(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incresasing_order(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
       incresasing_order(5);
    }
}
