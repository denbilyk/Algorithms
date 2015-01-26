package com.homenet.algorithms.sorting;


import org.junit.Test;

import java.util.Arrays;

public class MergeSortingSTest  {
    private long[] a = new long[]{12, 45, 2, 1, 4, 67, 43, 22, 6, 77, 87, 32, 19, 58};


    @Test
    public void test(){
        MergeSortingS mergeSortingS = new MergeSortingS(a);
        mergeSortingS.sort();
        System.out.println(Arrays.toString(a));
    }
}