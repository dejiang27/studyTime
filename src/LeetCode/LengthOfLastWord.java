package LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        int ans = 0;
        s = s.trim();
        if(s.length()<1 || s.equals(" ")){
            return ans;
        }
        String[] re = s.split(" ");
        if(re[re.length-1] != " "){
            ans = re[re.length-1].length();
        }else{
            return 0;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        LengthOfLastWord lw = new LengthOfLastWord();
        lw.lengthOfLastWord("Hello world");
        lw.lengthOfLastWord(" ");
        lw.lengthOfLastWord("");
        lw.lengthOfLastWord("a ");
    }
}
