//Print factorial of a number using recursion
public class factorial {
    public static int print_fact(int n){
        //base case
        if(n==0){

            return 1;
        }
        //inner call function
        int fac=n*print_fact(n-1);
        //return result
        return fac;

    }
    public static void main(String args[]){
        System.out.println(print_fact(5));
    }
}
