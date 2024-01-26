public class power {
    public static int powers(int x,int n){
        if(n==0){
            return 1;
        }
        return x* powers(x, n-1);
    }
    //Optimised Power
    public static int opt_Power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPowerSquare=opt_Power(x, n/2)*opt_Power(x, n/2);
        if(n%2!=0){
            halfPowerSquare=x*halfPowerSquare;
        }
        return halfPowerSquare;
    }
 public static void main(String args[]){
  System.out.println(  powers(2, 4));
  System.out.println(opt_Power(2, 6));
 }   
}
