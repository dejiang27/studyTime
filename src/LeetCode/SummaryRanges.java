package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        int l,r;
        for(int i = 0; i < nums.length-1; i ++){

            l = i;
            r = i +1;


        }


        return ans;
    }

    public static void main(String[] args){
        SummaryRanges sr = new SummaryRanges();
        sr.summaryRanges(new int[]{0,1,2,4,5,7});
    }
}
