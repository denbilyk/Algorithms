package com.homenet.algorithms.sorting;

import java.util.Arrays;

/**
 * @author denis.bilyk
 */
public class MergeSortingS {
    private long[] input;

    public MergeSortingS(long[] input) {
        this.input = input;
    }

    public void sort() {
        long[] workspace = new long[input.length];
        recCount(workspace, 0, input.length - 1);
    }

    void recCount(long[] workspace, int lowerBound, int upperBound) {

        if (upperBound == lowerBound) return;

        int mid = (lowerBound + upperBound) / 2;

        recCount(workspace, lowerBound, mid);

        recCount(workspace, mid + 1, upperBound);

        merge(input, workspace, lowerBound, mid, upperBound);

    }


    void merge(long[] source, long[] workspace, int lowerBound, int mid, int upperBound) {
        int lowPtr = lowerBound;
        int highPtr = mid + 1;
        int j = 0;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (source[lowPtr] < source[highPtr]) {
                workspace[j++] = source[lowPtr++];
            } else {
                workspace[j++] = source[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workspace[j++] = source[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workspace[j++] = source[highPtr++];
        }

        for (j = 0; j < n; j++) {
            source[lowerBound + j] = workspace[j];
        }

    }

}
