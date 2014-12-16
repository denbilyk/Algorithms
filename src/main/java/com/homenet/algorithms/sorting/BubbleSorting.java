package com.homenet.algorithms.sorting;

/**
 * @author denis.bilyk
 */
public class BubbleSorting extends AbstractSorting {

    public BubbleSorting(int size) {
        super(size);
    }

    public void sort() {
        int marker = a.length - 1;
        for (int i = marker; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

}
