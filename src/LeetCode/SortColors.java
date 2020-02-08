package LeetCode;

public class SortColors {

    public void sortColors(int[] nums) {

        int n = nums.length;

        for (int i = 1; i < n; i ++){
            int key = nums[i];
            int j = i -1;
            while(j>= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j --;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args){
        SortColors sc = new SortColors();

        sc.sortColors(new int[]{2,0,2,1,1,0});
    }

}
