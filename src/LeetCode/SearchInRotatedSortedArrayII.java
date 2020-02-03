package LeetCode;

public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {

        for(int x = 0; x < nums.length; x ++){
            if(nums[x] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        SearchInRotatedSortedArrayII sa = new SearchInRotatedSortedArrayII();

        sa.search(new int[]{2,5,6,0,0,1,2}, 0);
        sa.search(new int[]{2,5,6,0,0,1,2}, 3);
    }

}
