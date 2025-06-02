package com.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        result.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 0, j = 1; j < intervals.length; i++) {
            System.out.println(Arrays.toString(result.get(i)) + ", " + Arrays.toString(intervals[i]));
            if (isOverlapping(result.get(i), intervals[j])) {
                int[] mergedEl = merge(result.get(i), intervals[j]);
                result.get(i)[0] = mergedEl[0];
                result.get(i)[1] = mergedEl[1];
                i--;
                j++;
            } else {
                result.add(new int[]{intervals[j][0], intervals[j][1]});
                j++;
            }
        }

        return result.toArray(new int[][]{});
    }

    private boolean isOverlapping(int[] a, int[] b) {
        return (b[0] >= a[0] && b[0] <= a[1]) || (b[1] >= a[0] && b[1] <= a[1]);
    }

    private int[] merge(int[] a, int[] b) {
        return new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])};
    }

}
