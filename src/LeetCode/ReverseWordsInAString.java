package LeetCode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String ans = "";
        if(s.length() == 0){
            return ans;
        }
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] an = s.split(" ");
        for(int x = 0; x < an.length; x ++){
            if(x != 0){
                ans = an[x]+" "+ans;
            }else{
                ans = an[x];
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args){
        ReverseWordsInAString rw = new ReverseWordsInAString();
        rw.reverseWords("the sky is blue");
        rw.reverseWords("a good   example");
    }
}
