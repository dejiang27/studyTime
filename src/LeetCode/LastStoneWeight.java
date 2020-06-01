package LeetCode;

import java.util.Arrays;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones){
        int n = stones.length;
        if(n == 1){
            return stones[0];
        }
        Arrays.sort(stones);
        while(stones[n-1] != 0){
            int x = stones[n-1], y = stones[n-2];
            if(x == y && x != 0){
                stones[n-1] = 0;
                stones[n-2] = 0;
            }else if(y == 0){
                return x;
            }else{
                stones[n-2] = 0;
                stones[n-1] = x - y;
            }
            Arrays.sort(stones);
        }
        return 0;
    }

    public static void main(String[] args){
        LastStoneWeight lsw = new LastStoneWeight();

        int x = lsw.lastStoneWeight(new int[]{2,7,4,1,8,1});
        System.out.println(x);
    }



}
