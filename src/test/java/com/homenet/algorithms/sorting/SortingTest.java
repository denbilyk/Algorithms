package com.homenet.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author denis.bilyk
 */
public class SortingTest {

    @Test
    public void bubbleSortingTest() {
        BubbleSorting bubbleSorting = new BubbleSorting(10);
        bubbleSorting.fill();
        bubbleSorting.sort();
        assertSortedArray(bubbleSorting.getArray());
        bubbleSorting.print();
    }

    @Test
    public void selectionSertingTest() {
        SelectionSorting selectionSorting = new SelectionSorting(10);
        selectionSorting.fill();
        selectionSorting.sort();
        assertSortedArray(selectionSorting.getArray());
        selectionSorting.print();
    }

    @Test
    public void insertionSortingTest() {
        InsertionSorting insertionSorting = new InsertionSorting(10);
        insertionSorting.fill();
        insertionSorting.sort();
        assertSortedArray(insertionSorting.getArray());
        insertionSorting.print();
    }

    @Test
    public void mergeSortingTest() {
        MergeSorting mergeSorting = new MergeSorting(120);
        mergeSorting.fill();
        mergeSorting.sort();
        assertSortedArray(mergeSorting.getArray());
        mergeSorting.print();
    }


    private void assertSortedArray(long[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 == a.length) return;
            Assert.assertTrue(a[i] <= a[i + 1]);
        }
    }
}
