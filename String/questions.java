/*
Question 1 : Count how many times lowercase vowels occurred in a String entered by the
user.

*/
import java.util.*;
public class basic {
    public static void main(String args[]) {
      String str=new Scanner(System.in).next();
      int count=0;
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("The number of vowels in lower case character :"+count);
    }
}

/*
Question 2 : What will be the output of the following code?

public class Solution {
public static void main(String args[]) {
String str = "ShradhaDidi";
String str1 = "ApnaCollege";
String str2 = "ShradhaDidi";
System.out.println(str.equals(str1) + " " + str.equals(str2));
}
}

*/
import java.util.*;
public class basic {
    public static void main(String args[]) {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));  //first it will be false and second one is true
        
    }
}

/*
Question 3 : What will be the output of the following code?

public class Solution {
public static void main(String args[]) {
String str = "ApnaCollege".replace("l", "");
System.out.println(str);
}
}

*/
import java.util.*;
public class basic {
    public static void main(String args[]){ 
       
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str); 
        //here the output will be Apnacoege
         
    }
}
/*
Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams?

If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not.
*/


