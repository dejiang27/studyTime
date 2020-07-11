package LeetCode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t){

        int check = -1;
        for(int i = 0; i < s.length(); i ++){
            char ss = s.charAt(i);
            if(t.indexOf(ss) > -1){
                t = t.substring(check+1);
            }else{
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public static void main(String[] args){
        IsSubsequence is = new IsSubsequence();
        is.isSubsequence("abc", "ahbgdc");
    }
}
