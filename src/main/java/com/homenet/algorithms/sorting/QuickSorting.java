package com.homenet.algorithms.sorting;

import java.util.Arrays;

/**
 * @author denis.bilyk
 */
public class QuickSorting {

    private long[] input;

    public QuickSorting(long[] input) {
        this.input = input;
    }

    public void resQuickSort(int left, int right) {
        if (right - left <= 0) return;
        //long pvt = median(left, right);
        long pvt = input[right];
        int part = partition(left, right, pvt);
        resQuickSort(left, part - 1);
        resQuickSort(part + 1, right);
    }

    private int partition(int left, int right, long pvt) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (input[++leftPtr] < pvt) ;
            while (rightPtr > 0 && input[--rightPtr] > pvt) ;
            if (leftPtr >= rightPtr) break;
            else swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private long median(int left, int right) {
        int mid = (left + right) / 2;
        if (input[mid] < input[left]) swap(left, mid);
        if (input[mid] > input[right]) swap(mid, right);
        if (input[left] > input[right]) swap(left, right);
        swap(mid, right);
        return input[right];
    }

    private void swap(int left, int mid) {
        long tmp = input[left];
        input[left] = input[mid];
        input[mid] = tmp;
    }


    void print() {
        System.out.println(Arrays.toString(input));
    }


}
