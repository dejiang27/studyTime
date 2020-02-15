package LeetCode;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        int ans = 1;
        Arrays.sort(nums);
        if(nums.length == 0 || nums[0] > 1){
            System.out.println(ans);

            return ans;
        }
        int i = 0;
        int x = nums.length;
        while(i < x){
            if(nums[i] == ans){
                i ++;
                ans ++;
                continue;
            }else if(nums[i] < ans) {
                i ++;
                continue;
            }else{
                System.out.println(ans);
                return ans;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        FirstMissingPositive fmp = new FirstMissingPositive();
        fmp.firstMissingPositive(new int[]{1,2,0});
        fmp.firstMissingPositive(new int[]{3,4,-1,1});
        fmp.firstMissingPositive(new int[]{7,8,9,11,12});
        fmp.firstMissingPositive(new int[]{-5});
        fmp.firstMissingPositive(new int[]{});
    }
}
