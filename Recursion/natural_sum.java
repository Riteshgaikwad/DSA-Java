//Print the sum of first n natural numbers
public class natural_sum {
    public static int sumOfNatural(int n){
        //base case
        if(n==1){
            return 1;
        }
        //Inner call function
        int sum=n+sumOfNatural(n-1);
        //return result
        return sum;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(sumOfNatural(n));
        
    }
    
}
