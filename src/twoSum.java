/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
import java.util.*;

public class twoSum {

    public int[] TwoSums(int target, int[] nums){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int x = 0; x < nums.length; x ++) {
            if (!map.containsKey(nums[x])) {
                map.put(nums[x], x);
            }else{
                if(map.get(nums[x]) != x && target==nums[map.get(nums[x])]+nums[x]){
                    return new int[]{map.get(nums[x]), x};
                }
            }
        }

        for(int y = 0; y < nums.length; y ++){
            if(map.containsKey(target - nums[y]) && map.get(target - nums[y])>y){
                return new int[]{y, map.get(target - nums[y])};
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args){

        int[] nums0 = new int[]{2, 7, 11, 15};

        int[] nums1 = new int[]{3,2,4};

        int[] nums2 = new int[]{3,3};

        twoSum ts = new twoSum();

        int[] x = ts.TwoSums(9, nums0);
        System.out.println(x[0] + ", " + x[1]);

        int[] y = ts.TwoSums(6, nums1);
        System.out.println(y[0] + ", " + y[1]);

        int[] z = ts.TwoSums(6, nums2);
        System.out.println(z[0] + ", " + z[1]);

    }

}
