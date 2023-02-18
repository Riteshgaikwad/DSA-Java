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
/*
Q:-Give a route containing 4 directions (E,W,N,S),find the shortest path to reach distination
*/
import java.util.Scanner;

public class basic {
    public static float get_shortest_path(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);
    }
   public static void main(String args[]){
    String path="WNEENESENNN";
       System.out.println( get_shortest_path(path));
        
   }
}
