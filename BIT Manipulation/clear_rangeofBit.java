//clear the range of bits given as an input
public class clear_rangeofBit {
    public static int clear_range(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bit_mask=a | b;
        return n & bit_mask;
    }
    public static void main(String srgs[]){
        System.out.println(clear_range(10, 2, 4));
    }    
}
