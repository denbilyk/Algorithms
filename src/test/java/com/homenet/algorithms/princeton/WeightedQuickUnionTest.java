package com.homenet.algorithms.princeton;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WeightedQuickUnionTest {

    @Test
    public void test() {
        WeightedQuickUnion union = new WeightedQuickUnion(10);
        union.union(4,3);
        union.union(3,8);
        union.union(6,5);
        union.union(9,4);
        union.union(2,1);
        union.union(5,0);
        union.union(7,2);
        union.union(6,1);
        union.union(7,3);
        System.out.println(Arrays.toString(union.getArray()));

    }

}