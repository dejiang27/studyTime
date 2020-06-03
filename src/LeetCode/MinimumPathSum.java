package LeetCode;

public class MinimumPathSum {

    public int minPathSum(int[][] grid){

        int y = grid.length, x = grid[0].length;
        for(int i = 1; i < x; i ++){
            grid[0][i] += grid[0][i - 1];
        }
        for(int i = 1; i < y; i ++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i < y; i ++){
            for(int j = 1; j < x; j ++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[y-1][x-1];
    }

    public static void main(String[] args){

        MinimumPathSum mps = new MinimumPathSum();
        mps.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});

    }
}
