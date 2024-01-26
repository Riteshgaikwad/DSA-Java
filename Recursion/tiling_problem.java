public class tiling_problem {
    public static int tilling(int n){
        //base
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertia=cal tiles
        int fnm1=tilling(n-1);
        //horizontal choice
        int fnm2=tilling(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(tilling(4));
    }
    
}
