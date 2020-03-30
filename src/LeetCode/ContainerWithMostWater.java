package LeetCode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int area = 0;
        if(height.length < 2){
            return area;
        }

        int n = height.length, l = 0, r = n-1;



        return area;
    }

    public static void main(String[] args){
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        cwmw.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
