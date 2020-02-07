package LeetCode;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n){

        int[][] max = new int[n][n];

        int r1 = 0, r2 = n-1;
        int c1 = 0, c2 = n-1;
        int index = 1;
        int i = 0, j = 0;
        while(r2 >= r1 && c2 >= c1){

            for(int c = c1; c <= c2; c++){
                max[r1][c] = index;
                index ++;
            }

            for(int r = r1+1; r <= r2; r++){
                max[r][c2] = index;
                index ++;
            }

            if(r1<r2 && c1<c2){
                for(int c = c2-1; c > c1; c--){
                    max[r2][c] = index;
                    index++;
                }
                for(int r = r2; r > r1; r --){
                    max[r][c1] = index;
                    index ++;
                }
            }
            r1 ++;
            r2 --;
            c1 ++;
            c2 --;
        }

        for(int x = 0; x < n; x ++){
            String s = "";
            for(int y = 0; y < n; y++){
                s = s + max[x][y] + ", ";
            }
            System.out.println(s);
        }

        return max;
    }

    public static void main(String[] args){
        SpiralMatrixII sm = new SpiralMatrixII();
        sm.generateMatrix(3);
    }
}
