package LeetCode;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;

        for(int i = 0; i < nums.length; i ++){
            int sum = 0;
            for(int x = i; x < nums.length; x ++){
                sum = sum + nums[x];
                if(sum == k){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        SubarraySumEqualsK sse = new SubarraySumEqualsK();

        sse.subarraySum(new int[]{1,1,1}, 2);
    }
}
