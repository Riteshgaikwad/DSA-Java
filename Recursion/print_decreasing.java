//Print number from n to 1 in decreasing order using Recursion
class print_decreasing{
    public static void print_dec(int n){
        //Base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //print number
        System.out.print(n+" ");
        //inner call  function
        print_dec(n-1);
    }
    public static void main(String args[]){

        int n=10;
        print_dec(n); 
    }
}