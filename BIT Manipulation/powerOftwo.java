//Check if number is a Power of 2 or not
public class powerOftwo {
    public static boolean isPower(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(isPower(8));
        System.out.println(isPower(5));
    }
    
}
