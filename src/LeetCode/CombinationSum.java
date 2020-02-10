package LeetCode;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(candidates);
        backTrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start){
        if(remain == 0){
            result.add(new ArrayList<>(tempList));
        }else{
            for(int i=start; i<candidates.length;i++){
                if(!(candidates[i]>remain)){
                    tempList.add(candidates[i]);
                    backTrack(result, tempList, candidates, remain-candidates[i], i);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    public static void main(String[] args){
        CombinationSum cs = new CombinationSum();

        cs.combinationSum(new int[]{2,3,6,7}, 7);
        cs.combinationSum(new int[]{2,3,5}, 8);
    }
}
