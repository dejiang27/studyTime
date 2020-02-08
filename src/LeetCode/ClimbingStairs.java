package LeetCode;

public class ClimbingStairs {
    public int climbStairs(int n) {

        int ans = 1;
        if(n == 1){
            return ans;
        }
        int first = 1, second = 2;
        for(int x = 3; x <= n; x ++){
            int third = first + second;
            first = second;
            second = third;
        }
        ans = second;
        return ans;
    }

    public static void main(String[] args){
        ClimbingStairs cs = new ClimbingStairs();
        cs.climbStairs(2);
        cs.climbStairs(3);
    }
}
