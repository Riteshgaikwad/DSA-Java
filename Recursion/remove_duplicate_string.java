public class remove_duplicate_string {
    public static void remve_dup(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            remve_dup(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            remve_dup(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str="appnnacollege";
        remve_dup(str, 0,new StringBuilder(""),new boolean[26]);
    }
    
}
