package LeetCode;

public class FindPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int helper = 0;
        if(nums.length == 1 && nums[0] == target){
            return new int[]{0,0};
        }
        for(int x = 0; x < nums.length; x ++){
            if(nums[x] == target && start == -1){
                start = x;
            }else if(nums[x] == target){
                helper ++;
            }else{
                continue;
            }
        }
        return new int[]{start, start + helper};
    }
    public static void main(String[] args){
        FindPositionOfElementInSortedArray fp = new FindPositionOfElementInSortedArray();

        fp.searchRange(new int[]{5,7,7,8,8,10}, 8);
        fp.searchRange(new int[]{5,7,7,8,8,10}, 6);


    }
}
