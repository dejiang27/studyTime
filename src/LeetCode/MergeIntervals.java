package LeetCode;

import javafx.scene.layout.ColumnConstraints;

import java.util.ArrayList;
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

        ArrayList<int[]> anss = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        for(int i = 0 ; i < intervals.length; i ++){
            System.out.println(intervals[i][0]+"+" +intervals[i][1]);
        }
        //TODO
        return null;

    }

    public static void main(String[] args){
        MergeIntervals mi = new MergeIntervals();
        mi.merge(new int[][]{{1,3}, {2,6},{8,10},{15,18}, {2,3}});
    }
}
