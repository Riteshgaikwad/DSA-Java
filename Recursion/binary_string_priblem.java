
class binary_string_priblem {
    public static void bin_str(int n,int last_place,String str){
        //base
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        bin_str(n-1, 0, str+"0");
        if(last_place==0){
            bin_str(n-1, 1, str+"1");
        }

    }
    public static void main(String args[]){
        bin_str(3, 0, "");
    }
    
}