/*
Input ("aaabbcccdd" ) -->Output ("a3b2c3d2")
*/
//Solution:-
public class basic {
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;      //do not use int because we have to add count in string
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>0){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]) {
      String str="aaabbcccdd";
      System.out.println(compress(str));
    }
}
