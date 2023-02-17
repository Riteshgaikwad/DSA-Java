import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name:-");
        String first_name = sc.next();
       for(int i=0;i<first_name.length();i++){
        System.out.print(first_name.charAt(i)+" ");  //print each character one by one from index 0 to length-1...
       }
       System.out.println();
        sc.close();
    }
}
