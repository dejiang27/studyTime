package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();

        for(int x = 0 ; x < candidates.length; x ++){
            helper.add(candidates[x]);
        }

        for(int x = 0; x < candidates.length; x ++){
            List<Integer> help = new ArrayList<>();
            if(target%candidates[x] == 0){
                int y = target - candidates[x];
                while(y >= 0 ){
                    help.add(candidates[x]);
                    y = y - candidates[x];
                }
                result.add(help);
            }else if(candidates[x] > target){
                continue;
            }else{
                int y = 0;
                if(helper.contains(target%candidates[x])){
                    help.add(target%candidates[x]);
                    y = target - (target%candidates[x]);
                    while(y > 0 ){
                        help.add(candidates[x]);
                        y = y - candidates[x];
                    }
                    if(!result.contains(help)) {
                        result.add(help);
                    }
                }
            }
        }
        for(int x = 0; x < result.size(); x ++){
            String list = "";
            for(int y = 0; y < result.get(x).size(); y ++){
                list = list + result.get(x).get(y) + ", ";
            }
            System.out.println(list);
        }
        return result;
    }

    public static void main(String[] args){
        CombinationSum cs = new CombinationSum();

        cs.combinationSum(new int[]{2,3,6,7}, 7);
        cs.combinationSum(new int[]{2,3,5}, 8);
    }
}
