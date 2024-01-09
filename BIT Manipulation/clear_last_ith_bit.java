
//clearing the last i th term eg. i=2 then 111100 
public class clear_last_ith_bit {
    public static int clear(int n,int i){
        int bit_mask=(~0)<<i;
        return n & bit_mask;
    }
    public static void main(String args[]){
        System.out.println(clear(15, 2));
    }
    
}
