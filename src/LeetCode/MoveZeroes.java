package LeetCode;

public class MoveZeroes {

    public void maveZeroes(int[] nums){

        int n = nums.length;
        int checker = 0;

        for(int i = 0; i < n; i ++){
            int tem = nums[i];
            if(tem != 0){
                nums[checker] = tem;
                checker ++;
            }
        }
        for(int y = checker; y < n; y ++){
            nums[y] = 0;
        }
    }


    public static void main(String[] args){
        MoveZeroes mz = new MoveZeroes();

        mz.maveZeroes(new int[]{0,1,0,3,12});


    }


}
