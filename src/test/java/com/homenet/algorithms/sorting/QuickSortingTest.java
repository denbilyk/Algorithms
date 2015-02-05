package com.homenet.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortingTest {
    //private long[] a = new long[]{12, 45, 2, 1, 4, 67, 43, 22, 6, 77, 87, 32, 19, 58};
    private long[] a = new long[]{12, 45, 2, 1, 67, 4, 3};


    @Test
    public void test(){
        QuickSorting qs = new QuickSorting(a);
        qs.resQuickSort(0, a.length-1);
        qs.print();
    }

}