package LeetCode;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)return i;
        }
        return i;
    }
    public static void main(String[] args){
        SearchInsertPosition sip = new SearchInsertPosition();
        sip.searchInsert(new int[]{1,3,5,6}, 5);
        sip.searchInsert(new int[]{1,3,5,6}, 2);
        sip.searchInsert(new int[]{1,3,5,6}, 7);
        sip.searchInsert(new int[]{1,3,5,6}, 0);

    }


}
