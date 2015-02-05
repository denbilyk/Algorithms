package com.homenet.algorithms.princeton;

/**
 * @author denis.bilyk
 */
public class WeightedQuickUnion {

    private final int[] id;
    private final int[] sz;

    public WeightedQuickUnion(int number) {
        id = new int[number];
        sz = new int[number];
        init(number);
    }

    public void union(int p, int q) {
        int j = root(q);
        int i = root(p);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }


    public int[] getArray() {
        return id;
    }

    private int root(int n) {
        while (n != id[n]) {
            id[n] = id[id[n]];
            n = id[n];
        }
        return n;
    }


    private void init(int number) {
        for (int i = 0; i < number; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
}
