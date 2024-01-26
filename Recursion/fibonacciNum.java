//Print nth fibonacci number using recursion
public class fibonacciNum {
    public static int print_fib(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        //Inner call function
        int fib=print_fib(n-1)+print_fib(n-2);
        //return result
        return fib;
    }
    public static void main(String args[]){
        int n=4; 
        System.out.println(print_fib(n));
    }
    
}
