package LeetCode;

public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        for(int x = 0; x < nums.length-1; x ++){

            if(nums[x]>nums[x+1]){
                return x;
            }
        }
        return nums.length -1;
    }

    public static void main(String[] args){
        FindPeakElement fp = new FindPeakElement();
        fp.findPeakElement(new int[]{1,2,3,1});
        fp.findPeakElement(new int[]{1,2,1,3,5,6,4});
    }
}
