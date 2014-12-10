package com.homenet.algorithms.sorting.sorting;

/**
 * @author denis.bilyk
 */
public class InsertionSorting extends AbstractSorting {

    public InsertionSorting(int size) {
        super(size);
    }

    @Override
    public void sort() {
        int in;
        for (int i = 1; i < a.length; i++) {
            long temp = a[i];
            in = i;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;

        }
    }
}
