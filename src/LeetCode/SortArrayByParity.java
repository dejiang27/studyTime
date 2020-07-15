package LeetCode;

public class SortArrayByParity {


    public int[] sortArrayByParity(int[] A){
        int[] ans = new int[A.length];

        int l = 0, r = A.length-1;
        int i = 0;
        while(i < A.length){
            if(A[i]%2 == 1){
                ans[r] = A[i];
                r --;
            }else{
                ans[l] = A[i];
                l ++;
            }

            i ++;
        }
        return ans;
    }
}
