package LeetCode;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int result = 0;
        if(nums.length == 0) return 0;
        for(int x = 1; x < nums.length; x ++){
            if(nums[result] != nums[x]){
                result++;
                nums[result] = nums[x];
            }
        }
        return result +1;
    }

    public static void main(String[] args){
        RemoveDuplicates rd = new RemoveDuplicates();

        rd.removeDuplicates(new int[]{1,1,3});
        rd.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

}
