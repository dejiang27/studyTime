package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.replace(num, hm.get(num)+1);
            }else{
                hm.put(num, 1);
            }
            if(hm.get(num) > n){
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        MajorityElement me = new MajorityElement();
        me.majorityElement(new int[]{3,2,3});
        me.majorityElement(new int[]{2,2,1,1,1,2,2});
    }
}
