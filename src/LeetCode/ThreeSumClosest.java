package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target){

        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int ans = 0;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int curr = nums[i] + nums[left] + nums[right];
                if(target - curr == 0){
                    return target;
                }
                else if(target - curr < 0){
                    if(curr - target < diff){
                        ans = target - curr;
                        diff = curr - target;
                    }
                    right--;
                }
                else{
                    if(target - curr < diff){
                        ans = target - curr;
                        diff = target - curr;
                    }
                    left++;
                }
            }
        }
        return target - ans;
    }



    public static void main(String[] args){
        ThreeSumClosest sc = new ThreeSumClosest();
        int[] test = new int[]{-1, 2, 1, -4};

        System.out.println("abs" + Math.abs(0));
        if(Math.abs(0) < Math.abs(-1)){
            System.out.println("you are right");

        }

        int target = 1;
        sc.threeSumClosest(test, target);
        sc.threeSumClosest(new int[]{0,2,1,-3}, 1);
    }
}
