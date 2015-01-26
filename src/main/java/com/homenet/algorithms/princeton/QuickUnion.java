package com.homenet.algorithms.princeton;

/**
 * @author denis.bilyk
 */
public class QuickUnion {
    private int[] id;

    public QuickUnion(int number) {
        id = new int[number];
        init(number);
    }

    public void union(int p, int q) {
        id[root(p)] = root(q);
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }


    public int[] getArray(){
        return id;
    }

    private int root(int n) {
        while (n != id[n]) n = id[n];
        return n;
    }

    private void init(int number) {
        for (int i = 0; i < number; i++) {
            id[i] = i;
        }
    }
}
