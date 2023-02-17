import java.util.Scanner;
public class basic {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:-");
    String name=sc.next();       // only include first word
    System.out.print(name);
    /*
     input:Tony
     output:Tony
     input:Tony Stark
     output:Tony
     */

    System.out.println("Enter your name:-");
    String name2=sc.nextLine();  //print whole line 
    System.out.print(name2);
    /*
     input:Tony Stark
     output:Tony Stark
     input:Hi,this is ritesh
     output:Hi,this is ritesh
     */
   }
}
