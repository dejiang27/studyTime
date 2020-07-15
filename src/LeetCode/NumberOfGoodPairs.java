package LeetCode;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums){
        int ans = 0, count[] = new int[101];
        for (int a: nums) {
            count[a]++;
            ans += count[a]-1;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        NumberOfGoodPairs ng = new NumberOfGoodPairs();
        ng.numIdenticalPairs(new int[]{1,2,3,4,5,1});


        int[] t = new int[10];
        int test = 0;
        test += t[1]++;
        for(int T:t){
            System.out.println(T);
        }
        System.out.println(test);
    }
}
