package LeetCode;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;

        for(int i = 1; i < nums.length; i ++){
            if(nums[i]-nums[i-1] > max){

                max = nums[i]-nums[i-1];
                System.out.println(max);
            }
        }
        return max;
    }

    public static void main(String[] args){
        MaximumGap mg = new MaximumGap();
        mg.maximumGap(new int[]{3,6,9,1});
        mg.maximumGap(new int[]{1,10000000});
    }
}
