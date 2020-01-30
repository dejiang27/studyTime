package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        int n = nums.length;

        if(n < 4){
            return results;
        }

        for(int x = 0; x < n; x ++){
            for(int y = x +1; y < n; y ++){

                int l = y +1;
                int r = n-1;
                while(l < r){
                    int result = nums[x]+nums[y]+nums[l]+nums[r];
                    if (result == target && !results.contains(Arrays.asList(nums[x], nums[y], nums[l], nums[r]))){
                        results.add(Arrays.asList(nums[x], nums[y], nums[l], nums[r]));
                        l ++;
                        r --;
                    }else if (result< target){
                        l ++;
                    }else{
                        r --;
                    }
                }

            }
        }
        for(int x =0; x < results.size(); x ++){
            String four = "";
            for(int y = 0; y< results.get(x).size(); y ++){
                four = four + results.get(x).get(y) + ", ";
            }
            System.out.println(four);
        }
        return results;

    }

    public static void main(String[] args){
        FourSum fs = new FourSum();

        fs.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        fs.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);

    }
}
