package LeetCode;

public class SearchAMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length < 1){
            return false;
        }
        for(int x = 0; x < matrix.length; x ++){
            if(matrix[x].length == 0){
                break;
            }
            if(matrix[x][0] <= target && matrix[x][matrix[x].length-1] >=target){
                for(int y = 0; y < matrix[x].length; y ++){
                    if(target == matrix[x][y]){
                        System.out.println("Found " +matrix[x][y]);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        SearchAMatrix sm = new SearchAMatrix();
        sm.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 3);
    }
}
