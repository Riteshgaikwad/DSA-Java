/*
Here we will see that when the strings are shown equal 
let us ren this code and understand properly about it
*/
import java.util.Scanner;

public class basic {
    
   public static void main(String args[]){
    String s1="Tony";
    String s2="Tony";
    String s3=new String("Tony");
    if(s1==s2){
        System.out.println("String are equal");
    }
    else{
        System.out.println("String are not equal");
    }// Output as they are equal...
    if(s1==s3){   // Objectly compares s1&s3 when = is used
        System.out.println("String are equal");
    }else{
        System.out.println("String are not equal");
    }// Output as they are not equal...
    if(s1.equals(s3)){ //IMPORTANT...
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal");
    }//Output as they are equal...
   }
}
