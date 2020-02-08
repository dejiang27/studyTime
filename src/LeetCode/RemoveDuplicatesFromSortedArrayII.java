package LeetCode;

public class RemoveDuplicatesFromSortedArrayII {


    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int j = 1;
        boolean found = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
                found = false;
            }
            else {
                if (!found) {
                    nums[j++] = nums[i];
                }
                found = true;
            }
        }
        return j;
    }

    public static void main(String[] args){
        RemoveDuplicatesFromSortedArrayII rd = new RemoveDuplicatesFromSortedArrayII();
        rd.removeDuplicates(new int[]{1,1,1,2,2,3});
    }
}
