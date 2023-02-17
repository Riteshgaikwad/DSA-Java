import java.util.Scanner;
public class basic {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:-");
    String name=sc.next();       // only include first word
    System.out.println("The length of a string is:"+name.length()); //print the length of input string
   }
}
