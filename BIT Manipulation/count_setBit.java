
//count Set bits in a number eg:- 1010 , no.of set bits-2
public class count_setBit {
    public static int count_bits(int n){
        int count=0;
        while(n>0){
            if((n &1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(count_bits(15));
    }
}
