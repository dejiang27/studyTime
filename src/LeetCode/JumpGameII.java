package LeetCode;

public class JumpGameII {

    public int jump(int[] nums){

        int ans = 0;
        int lastIndex = nums[0];
        int i = 0;
        int n = nums.length;

        if(lastIndex == 0 || n == 1) {
            return 0;
        }

        while(i <= lastIndex && lastIndex < n){
            if(i + nums[i]>lastIndex) {
                lastIndex = i + nums[i];
                ans++;
            }
            i++;
            //TODO
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        JumpGameII jg = new JumpGameII();
        jg.jump(new int[]{2,3,1,1,4});
    }
}
