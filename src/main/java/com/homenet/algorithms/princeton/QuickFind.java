package com.homenet.algorithms.princeton;

import java.util.Arrays;

/**
 * @author denis.bilyk
 */
public class QuickFind {
    private int[] id;

    public QuickFind(int number) {
        id = new int[number];
        init(number);
    }


    public void union(int p, int q) {
        int pInt = id[p]; /* value should be changed */
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pInt) id[i] = id[q];
        }
    }


    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void printArray(){
        System.out.println(Arrays.toString(id));
    }

    private void init(int number) {
        for (int i = 0; i < number; i++) {
            id[i] = i;
        }
    }



}
