package LeetCode;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        if(m == 0){
            return;
        }
        int n = matrix[0].length;
        boolean zero = false;
        int[] row = new int[n];
        for(int r1 = 0; r1 < m; r1++){
            zero = false;
            for(int c1 =0; c1 < n; c1 ++){

                if(row[c1] == 1 && matrix[r1][c1] != 0){
                    matrix[r1][c1] = 0;
                }
                else if(matrix[r1][c1] == 0){
                    zero = true;
                    int tem = r1;
                    while(tem >= 0){
                        matrix[tem][c1] = 0;
                        tem --;
                    }
                    row[c1] = 1;
                }
            }
            if(zero){
                matrix[r1] = new int[n];
            }
        }
    }

    public static void main(String[] args){
        SetMatrixZeroes sm = new SetMatrixZeroes();
        sm.setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }

}
