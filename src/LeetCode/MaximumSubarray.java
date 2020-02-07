package LeetCode;

public class MaximumSubarray {

    public int maxSubArray(int[] nums){
        int maxSum = nums[0];

        for (int numsIndex = 1; numsIndex < nums.length; numsIndex++) {
            nums[numsIndex] = Math.max(nums[numsIndex-1] + nums[numsIndex], nums[numsIndex]);
            maxSum = Math.max(maxSum, nums[numsIndex]);
        }

        return maxSum;
    }

    public static void main(String[] args){
        MaximumSubarray ms = new MaximumSubarray();
        ms.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

}
