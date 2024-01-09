
//here are some basic operation performed on bit like get , set , clear ,update
public class bit_operations {

    public static int get_ith_bit(int n,int i){
        int bit_mask=1<<i;
        if((n&bit_mask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int set_ith_bit(int n,int i){
        int bit_mark=1<<i;
        return n | bit_mark;
    }
    public static int clear_ith_bit(int n,int i){
        int bit_mark=~(1<<i);
        return n & bit_mark;
    }
    public static int update_ith_bit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clear_ith_bit(n, i);
        // }else{
        //     return set_ith_bit(n, i);
        // }
        n=clear_ith_bit(n, i);
        int bit_mask=newBit<<i;
        return n | bit_mask;
    }
    public static void main(String args[]){
        System.out.println(get_ith_bit(10, 2));
        System.out.println(get_ith_bit(10, 3));
        System.out.println(set_ith_bit(10, 2));
        System.out.println(clear_ith_bit(10, 1));
        System.out.println(update_ith_bit(10, 2,1));
    }
    
}
 