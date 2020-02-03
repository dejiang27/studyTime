package LeetCode;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int result = -1;

        for(int x = 0; x < nums.length; x ++){
            if(nums[x] == target){
                return x;
            }
        }
        return result;
    }

    public static void main(String[] args){
        SearchInRotatedSortedArray sa = new SearchInRotatedSortedArray();

        sa.search(new int[]{4,5,6,7,0,1,2}, 0);
        sa.search(new int[]{4,5,6,7,0,1,2}, 3);

    }
}
