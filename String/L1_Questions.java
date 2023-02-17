/*
Q:-Check if a string is a Palindrome
"racecar" , "noon" ,"madam"
*/
import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str=sc.next();
        if(is_palindrome(str)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
    public static boolean is_palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length()-1;
            if(str.charAt(i)!=str.charAt(n-i)){
               return false;
            }
           
            
        }
        return true;
    }
}
