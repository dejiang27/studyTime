package LeetCode;

import java.util.Arrays;

public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs){

        int ans = 0;

        int[] helper = new int[costs.length];

        for(int i = 0; i < costs.length; i ++){
            ans += costs[i][0];
            helper[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(helper);
        for(int i = 0; i < costs.length/2; i ++){
            ans += helper[i];
        }
        return ans;

    }
}
