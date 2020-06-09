package LeetCode;

public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums){
        //int checker = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1; i < nums.length; i += 2){

            if(nums[i] == nums[i-1]){
                continue;
            }else{
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
