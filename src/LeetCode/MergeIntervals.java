package LeetCode;

import java.util.Arrays;

public class MergeIntervals {

    /*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
     */
    public int[][] merge(int[][] intervals) {

        int[][] ans;
        int n = intervals.length;
        int start, end;

        //TODO

        //Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println(intervals);
        return null;

    }

    public static void main(String[] args){
        MergeIntervals mi = new MergeIntervals();
        mi.merge(new int[][]{{1,3}, {2,6},{8,10},{15,18}});
    }
}
