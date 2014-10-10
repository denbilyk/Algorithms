package com.homenet.algorithms.array;

/**
 * @author denis.bilyk
 */
public class LowArray {
    private long[] array;
    private boolean duplicates;
    private int numCount = 0;

    public LowArray(int capacity, boolean duplicates) {
        this.duplicates = duplicates;
        array = new long[capacity];
    }

    public int size() {
        return numCount;
    }

    public boolean contains(long value) {
        for (long l : array) {
            if (l == value) {
                return true;
            }
        }
        return false;
    }

    public void dump() {
        for (long l : array) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public void insert(long value) {
        if (!duplicates && contains(value)) return;
        processInsert(value);
    }

    private void processInsert(long value) {
        int length = array.length;
        if (numCount < length) {
            array[numCount] = value;
            numCount++;
        }
    }


    public void remove(long value) {
        if (!contains(value)) return;
        int pointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                pointer = i;
                break;
            }
        }

        for (int k = pointer; k < array.length - 1; k++) {
            array[k] = array[k + 1];
        }
        numCount--;
        if (duplicates) {
            remove(value);
        }
    }

}
