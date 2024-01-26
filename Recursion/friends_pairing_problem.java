public class friends_pairing_problem {
    public static int no_pairs(int n){
        if(n==1 || n==2){
            return n;
        }
        return no_pairs(n-1)+(n-1)*no_pairs(n-2);
    }
    public static void main(String args[]){
         System.out.println(no_pairs(3));
    }
    
}
