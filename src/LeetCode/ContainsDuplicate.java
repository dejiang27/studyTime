package LeetCode;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        /*List<Integer> hm = new ArrayList<>();
        for(int x = 0; x < nums.length; x ++){
            if(hm.contains(nums[x])){
                return true;
            }else{
                hm.add(nums[x]);
            }
        }
        return false;*/
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate cd = new ContainsDuplicate();
        cd.containsDuplicate(new int[]{1,2,3,1});
    }
}
