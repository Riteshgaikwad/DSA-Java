/*
StringBuilder sb=new StringBuilder("HW");
sb.toString();

int a=10;           //not possible               Integer a=10;
a.toString();                                     a.toString();        //correct
 
char ch='a';        //not possible                Character ch='a';
ch.toString();                                     ch=toString();      //correct
*/

//create:-
public class basic {
   public static void main(String args[]){
    StringBuilder sb=new StringBuilder("");        //created an string builder
    for(char ch='a';ch<='z';ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
   }
}

/*
Q:-For a given string convert the first letter of each word to upper case
*/
//Solution:-
public class basic {
    public static String to_upper_case(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
      System.out.println(to_upper_case("harry"));
    }
}

