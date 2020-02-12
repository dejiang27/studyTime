package LeetCode;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        while(k>0)
        {
            int i,temp=nums[nums.length-1];
            for( i=nums.length-1;i>0;i--)
            {
                nums[i] = nums[i-1];
            }
            nums[i]=temp;
            k--;
        }
    }

    public static void main(String[] args){
        RotateArray ra = new RotateArray();
        ra.rotate(new int[]{1,2,3,4,5,6,7} , 3);
        //ra.rotate(new int[]{-1, -100, 3, 99} , 2);
    }
}
