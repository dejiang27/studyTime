package LeetCode;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        if(needle.isEmpty()) {
            return 0;
        }
        int n = needle.length();
        for(int x = 0; x < haystack.length()-n+1; x ++) {
            if (haystack.substring(x, n + x).equals(needle)) {
                System.out.println(x);
                return x;
            }
        }
        System.out.println(-1);
        return -1;
    }

    public static void main(String[] args){
        ImplementStrStr is = new ImplementStrStr();
        is.strStr("hello", "ll");
        is.strStr("aaaaa", "bba");
    }
}
