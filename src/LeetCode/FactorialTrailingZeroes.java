package LeetCode;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {

        int ans = 0;
        while(n > 1){
            n = n / 5;
            ans = ans + n;
        }
        return ans;

    }

    public static void main(String[] args){
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        ftz.trailingZeroes(3);
        ftz.trailingZeroes(5);
    }

}
