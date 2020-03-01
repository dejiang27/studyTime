package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int q=nums.length;

        for(int i = 0;i<nums.length;i++){
            if(0>Arrays.binarySearch(nums, q--))
                ans.add(q+1);
        }
        return ans;

    }

    public static void main(String[] args){
        FindAllNumbersDisappearedInAnArray fan = new FindAllNumbersDisappearedInAnArray();

        fan.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

}
