//Check if number is odd or even 
class odd_even{
    public static void oddEven(int n){
        int my_bit=1;
        if((n&my_bit)==1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String args[]){
        oddEven(3);
        oddEven(11);
        oddEven(14);
    }
}