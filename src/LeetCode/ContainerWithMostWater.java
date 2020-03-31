package LeetCode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int Marea = 0;
        if(height.length < 2){
            return Marea;
        }

        int n = height.length, l = 0, r = n-1;

        while(l < r){
            int area = (r - l) * Integer.min(height[l], height[r]);
            if(Marea < area){
                Marea = area;
            }
            if(height[l] > height[r]){
                r --;
            }else{
                l ++;
            }
        }
        System.out.println(Marea);
        return Marea;
    }

    public static void main(String[] args){
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        cwmw.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
