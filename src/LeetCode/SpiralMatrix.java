package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        if(m == 0){
            return ans;
        }
        int n = matrix[0].length;
        int i, k = 0, l = 0;

        while(k<m && l<n){
            for(i = l; i < n; i ++){
                ans.add(matrix[k][i]);
            }
            k++;
            for(i = k; i < m; i ++){
                ans.add(matrix[i][n-1]);
            }
            n--;
            if(k<m){
                for(i = n-1; i >=l; i --){
                    ans.add(matrix[m-1][i]);
                }
                m --;
            }
            if(l<n){
                for(i = m-1; i>= k; i --){
                    ans.add(matrix[i][l]);
                }
                l ++;
            }
        }
        return ans;
    }

    public static void main(String[] agrs){
        SpiralMatrix sm = new SpiralMatrix();
        sm.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        sm.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
    }
}
