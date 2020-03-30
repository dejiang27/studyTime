package LeetCode;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        String ans = "";





        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args){
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        lps.longestPalindrome("babab");

        lps.longestPalindrome("cbbc");
    }
}
