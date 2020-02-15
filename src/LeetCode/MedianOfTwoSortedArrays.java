package LeetCode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] me = new int[m+n];
        double ans = 0;

        //TODO
        return ans;

    }

    public static void main(String[] args){
        MedianOfTwoSortedArrays mtb = new MedianOfTwoSortedArrays();
        mtb.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        mtb.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
    }
}
