package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public int singleNumber(int[] nums) {

        int ans;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            if(hm.containsKey(nums[i])){
                hm.replace(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        for(Map.Entry an : hm.entrySet()){
            if((int) an.getValue() == 1){
                System.out.println((int) an.getKey());
                return (int)an.getKey();
            }
        }
        return 0;
    }
}
