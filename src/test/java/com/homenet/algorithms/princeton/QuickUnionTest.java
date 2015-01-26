package com.homenet.algorithms.princeton;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickUnionTest {

    @Test
    public void testRight() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4, 3);
        quickUnion.union(3, 8);
        quickUnion.union(6, 5);
        quickUnion.union(9, 4);
        quickUnion.union(2, 1);
        quickUnion.union(5, 0);
        quickUnion.union(7, 2);
        quickUnion.union(6, 1);
        quickUnion.union(7, 3);
        assertArrayEquals(new int[]{1, 8, 1, 8, 3, 0, 5, 1, 8, 8}, quickUnion.getArray());
    }


    @Test
    public void test() {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4, 8);
        quickUnion.union(1, 2);
        quickUnion.union(8, 3);
        quickUnion.union(3, 7);
        quickUnion.union(9, 0);
        quickUnion.union(1, 9);
        quickUnion.union(6, 4);
        quickUnion.union(9, 6);
        quickUnion.union(2, 5);
        System.out.println(Arrays.toString(quickUnion.getArray()));
    }


    /* 4-8 1-2 8-3 3-7 9-0 1-9 6-4 9-6 2-5 */
}