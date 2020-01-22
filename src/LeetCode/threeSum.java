package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threeSum {

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
    public List<List<Integer>> ThreeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int Tsums, right, left;

        for(int x = 0; x< nums.length -1; x ++){
            left = x+1;
            right = nums.length-1;

            while(left< right){
                if(nums[x]+nums[left]+nums[right]==0){
                    if(result.contains(Arrays.asList(nums[x], nums[left], nums[right]))){
                        break;
                    }
                    result.add(Arrays.asList(nums[x], nums[left], nums[right]));
                    left ++;
                    right --;
                }else if(nums[x]+nums[left]+nums[right] > 0){
                    right --;
                }else{
                    left ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        threeSum ts = new threeSum();

        int[] nums = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};

        List<List<Integer>> result = ts.ThreeSum(nums);

        for(int x = 0; x<result.size(); x ++){
            String print = "List: ";
            for (int y = 0; y < result.get(x).size(); y ++){
                print = print + result.get(x).get(y)+" ";
            }
            System.out.println(print);
        }
    }
}
