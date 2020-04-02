package LeetCode;

public class JumpGame {

    public boolean canJump(int[] nums){

        int l = nums.length;
        int lastIndex = nums[0];
        int i=0;
        while(i<=lastIndex && i<l){
            if(i + nums[i]>lastIndex)
                lastIndex = i + nums[i];
            i++;
        }

        if(i>=l)
            return true;
        return false;
    }

    public static void main(String[] args){
        JumpGame jg = new JumpGame();
        jg.canJump(new int[]{2,3,1,1,4});
        jg.canJump(new int[]{3,2,1,0,4});

    }
}
