package LeetCode;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2){

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                } else {
                    if(text1.charAt(i-1)==text2.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    } else {
                        dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                    }
                }
            }
        }
        return dp[m][n];
        /*int n1 = text1.length(), n2 = text2.length(), ans = 0;
        int m1 = 0, m2 = 0;
        while(n1 > m1){
            for(int i = m2; i < n2; i ++){
                if(text1.charAt(m1) == text2.charAt(i)){
                    System.out.println(i);
                    ans ++;
                    m2 = i + 1;
                    break;
                }
            }
            m1 ++;
        }
        System.out.println(ans);
        return ans;*/
    }

    public static void main(String[] args){
        LongestCommonSubsequence lc = new LongestCommonSubsequence();

        lc.longestCommonSubsequence("abcde", "ace");
        lc.longestCommonSubsequence("bsbininm","jmjkbkjkv");
    }

}
