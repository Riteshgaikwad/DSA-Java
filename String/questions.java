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

import java.util.*;

public class basic {
    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";
        // convert it to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            // if length are equal then convert String to character array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // Sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

    }
}
/*
Question 5 : Search and read about
a. intern( ) method in String
b. StringBuffer
*/
// Solution:-
/*
a. intern( ) method in String:-
When a string is created in Java, it occupies memory in the heap.
Also, we know that the String class is immutable. 
Therefore, whenever we create a string using the new keyword, new memory is allocated in the heap for corresponding string, which is irrespective of the content of the array. 
Consider the following code snippet.

String str = new String("Welcome to JavaTpoint.");   
String str1 = new String("Welcome to JavaTpoint");  
System.out.println(str1 == str); // prints false  
The println statement prints false because separate memory is allocated for each string literal. 
Thus, two new string objects are created in the memory i.e. str and str1. that holds different references.

We know that creating an object is a costly operation in Java. 
Therefore, to save time, Java developers came up with the concept of String Constant Pool (SCP). 
The SCP is an area inside the heap memory. It contains the unique strings. 
In order to put the strings in the string pool, one needs to call the intern() method. 
Before creating an object in the string pool, the JVM checks whether the string is already present in the pool or not. 
If the string is present, its reference is returned.

String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
System.out.println(str1 == str); // prints true  
In the above code snippet, the intern() method is invoked on the String objects.
Therefore, the memory is allocated in the SCP. For the second statement, no new string object is created as the content of str and str1 are the same. 
Therefore, the reference of the object created in the first statement is returned for str1. 
Thus, str and str1 both point to the same memory. Hence, the print statement prints true.
*/

/*
b. StringBuffer:-
   
*/
