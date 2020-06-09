package LeetCode;

public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B){
        return lcs(A, B, 0, 0);
    }

    public int lcs(int[] A, int[] B, int i, int j){

        if(i == A.length || j == B.length){
            return 0;
        }

        if(A[i] == B[j]){
            return 1 + lcs(A, B, i +1, j +1);
        }else{
            return Math.max(lcs(A, B, i +1, j), lcs(A, B, i, j +1));
        }
    }

    public static void main(String[] args){

    }

}
