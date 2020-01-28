package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target){

        if(nums.length < 3){

        }
        Arrays.sort(nums);

        int diff, l, r;
        int sums = 0;
        r = nums.length -1;
        diff = Integer.MAX_VALUE;

        for(int x = 0; x < nums.length -2; x ++){
            l = x + 1;
            if(Math.abs((nums[x]+nums[l]+nums[r]) - target) < Math.abs(diff)){
                diff = nums[x]+nums[l]+nums[r]-target;
                sums = nums[x]+nums[l]+nums[r];
            }
        }
        System.out.println("The result is: " +sums);
        return sums;
    }

    public static void main(String[] args){
        ThreeSumClosest sc = new ThreeSumClosest();
        int[] test = new int[]{-1, 2, 1, -4};
        int target = 1;
        sc.threeSumClosest(test, target);
    }
}
