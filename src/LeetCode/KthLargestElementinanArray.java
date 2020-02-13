package LeetCode;

import java.util.Arrays;

public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int ans = nums[nums.length - k];
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        KthLargestElementinanArray ke = new KthLargestElementinanArray();
        ke.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        ke.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);

    }
}
