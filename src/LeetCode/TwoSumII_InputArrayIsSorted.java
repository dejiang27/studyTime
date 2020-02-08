package LeetCode;

public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {

        int r = numbers.length-1;
        int l = 0;
        while(l < r){
            if(numbers[l] + numbers[r] == target){
                return new int[]{l+1, r+1};
            }if(numbers[l] + numbers[r] > target){
                r --;
                continue;
            }else{
                l ++;
                continue;
            }
        }
        return null;
    }
    public static void main(String[] args){
        TwoSumII_InputArrayIsSorted ts= new TwoSumII_InputArrayIsSorted();
        ts.twoSum(new int[]{2,7,11,15}, 9);
    }
}
