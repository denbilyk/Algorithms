package com.homenet.algorithms.sorting.sorting;

/**
 * @author denis.bilyk
 */
public class MergeSorting extends AbstractSorting {
    private int size;

    public MergeSorting(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public void sort() {
        long[] workspace = new long[size];
        recMergeSort(workspace, 0, size - 1);
    }


    private void recMergeSort(long[] workspace, int lowerBound, int upperBound) {

        /*  return if positions are match */
        if (lowerBound == upperBound) return;

        /* find the middle of array */
        int mid = (lowerBound + upperBound) / 2;

        /* sort upper half*/
        recMergeSort(workspace, lowerBound, mid);

        /* sort lower half*/
        recMergeSort(workspace, mid + 1, upperBound);


        /* merge arrays */
        merge(workspace, lowerBound, mid + 1, upperBound);


    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {

        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound)
            if (a[lowPtr] < a[highPtr])
                workSpace[j++] = a[lowPtr++];
            else
                workSpace[j++] = a[highPtr++];
        while (lowPtr <= mid)
            workSpace[j++] = a[lowPtr++];
        while (highPtr <= upperBound)
            workSpace[j++] = a[highPtr++];
        for (j = 0; j < n; j++)
            a[lowerBound + j] = workSpace[j];
    }

}
