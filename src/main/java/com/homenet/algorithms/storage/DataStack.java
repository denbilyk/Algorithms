package com.homenet.algorithms.storage;

/**
 * @author denis.bilyk
 */
public class DataStack implements IStack<Long> {
    private final int size;
    private long[] stackArray;
    private int pointer = -1;

    public DataStack() {
        this(50);
    }

    public DataStack(int size) {
        this.size = size;
        stackArray = new long[size];
    }

    @Override
    public void push(Long value) {
        if (!isOverFlow()) {
            stackArray[++pointer] = value;
        } else {
            resize();
            stackArray[++pointer] = value;
        }
    }

    @Override
    public Long pop() {
        return stackArray[pointer--];
    }

    @Override
    public Long peek() {
        if (pointer < 0) return -1L;
        return stackArray[pointer];
    }

    private boolean isOverFlow() {
        return pointer == stackArray.length - 1;
    }

    private void resize() {
        int newSize = stackArray.length * 2;
        long[] tmp = new long[newSize];
        for (int i = 0; i < stackArray.length; i++) {
            tmp[i] = stackArray[i];
        }
        stackArray = tmp;
    }

}
