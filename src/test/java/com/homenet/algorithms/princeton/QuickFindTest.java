package com.homenet.algorithms.princeton;

import org.junit.Test;

public class QuickFindTest {


    @Test
    public void test() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(0, 8);
        quickFind.union(3, 4);
        quickFind.union(2, 1);
        quickFind.union(0, 5);
        quickFind.union(7, 8);
        quickFind.union(7, 9);
        quickFind.printArray();

    }


    @Test
    public void testRight() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(6, 5);
        quickFind.union(5, 0);
        quickFind.union(7, 2);
        quickFind.union(2, 1);
        quickFind.union(9, 4);
        quickFind.union(4, 3);
        quickFind.union(3, 8);
        quickFind.printArray();  /* [0, 1, 1, 8, 8, 0, 0, 1, 8, 8]  */

    }

}