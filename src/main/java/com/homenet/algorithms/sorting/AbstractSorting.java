package com.homenet.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author denis.bilyk
 */
public abstract class AbstractSorting {
    long a[];
    private int size;

    public AbstractSorting(int size) {
        this.size = size;
        this.a = new long[size];
    }

    void swap(int i, int j) {
        long tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }

    public void fill() {
        if (size > a.length) {
            System.out.println("Opps. Size is not compatible");
        }

        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int val = Math.abs((int) Math.ceil(Math.random()) * rnd.nextInt(99));
            a[i] = val;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(a));
    }

    public abstract void sort();

    long[] getArray() {
        return a;
    }
}
