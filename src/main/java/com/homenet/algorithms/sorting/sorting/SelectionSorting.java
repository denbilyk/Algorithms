package com.homenet.algorithms.sorting.sorting;

/**
 * @author denis.bilyk
 */
public class SelectionSorting extends AbstractSorting {

    public SelectionSorting(int size) {
        super(size);
    }


    @Override
    public void sort() {
        for (int out = 0; out < a.length; out++) {
            int min = out;
            for (int in = out + 1; in < a.length; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }

    }
}
