package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    /*
    Given a collection of distinct integers, return all possible permutations.

    Example:

    Input: [1,2,3]
    Output:
    [
    [1,2,3],
    [1,3,2],
    [2,1,3],
    [2,3,1],
    [3,1,2],
    [3,2,1]
    ]
     */

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> con=new ArrayList<>();
            for(List<Integer> ele: res){
                for(int j=0; j<ele.size()+1; j++){
                    ele.add(j, nums[i]);
                    List<Integer> tmp=new ArrayList<>(ele);
                    con.add(tmp);
                    ele.remove(j);
                }
            }
            res=con;
        }
        return res;
    }
    public static void main(String[] args){
        Permutations per = new Permutations();
        per.permute(new int[]{1,2,3});
    }
}
