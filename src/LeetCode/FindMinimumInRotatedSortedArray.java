package LeetCode;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {

        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int x = 0; x < n; x ++){
            if(nums[x]< ans){
                ans = nums[x];
            }
        }

        return ans;
    }

    public static void main(String[] args){
        FindMinimumInRotatedSortedArray fm = new FindMinimumInRotatedSortedArray();

        fm.findMin(new int[]{3,4,5,1,2});
    }
}
