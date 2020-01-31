package LeetCode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int result = 0;
        for(int x = 0; x < nums.length; x ++){
            if(nums[x] != val){
                nums[result] = nums[x];
                result ++;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        RemoveElement re = new RemoveElement();

        re.removeElement(new int[]{3,2,2,3}, 3);
        re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);

    }
}
