package LeetCode;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int checker = 0, i = 0;
        while(checker < n){

            ans[i] = nums[checker];
            ans[i+1] = nums[n+checker];
            checker ++;
            i += 2;
        }

        return ans;
    }
}
