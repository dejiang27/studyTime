package LeetCode;

public class CountAndSay {

    public String countAndSay(int n) {
        if (n<=0) return null;
        if (n==1) return "1";

        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int lo=0;
        int hi=0;
        while(hi<s.length()){
            while(hi<s.length() && s.charAt(hi)==s.charAt(lo))
                hi++;

            sb.append(hi-lo);
            sb.append(s.charAt(lo));
            lo=hi;
        }

        return sb.toString();
    }

    public static void main(String[] args){
        CountAndSay cs = new CountAndSay();

        cs.countAndSay(1);
        cs.countAndSay(4);
    }
}
