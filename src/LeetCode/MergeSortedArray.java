package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = (n-- + m--) - 1;

        while(n >= 0) {
            if(m < 0 || nums2[n] > nums1[m]) { nums1[k--] = nums2[n--]; }
            else {
                nums1[k--] = nums1[m--];
            }
        }

    }

    public static void main(String[] args){
        MergeSortedArray ms = new MergeSortedArray();
        ms.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6}, 3);
    }
}
