//Print number 1 to n in increasing order using Recursion
public class print_increasing {
    public static void print_inc(int n){
        //Base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //inner call  function
        print_inc(n-1);
        //print
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        print_inc(n);
    }
}
