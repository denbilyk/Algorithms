package com.homenet.algorithms.stanford;

import com.homenet.algorithms.sorting.MergeSortingS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * @author denis.bilyk
 */
public class Task1 {

    public static void main(String[] args) throws IOException {
        URL data = Task1.class.getClassLoader().getResource("stanford/IntegerArray.txt");
        assert data != null;
        File dataFile = new File(data.getPath());
        FileReader reader = new FileReader(dataFile);
        BufferedReader r = new BufferedReader(reader);
        int prt = 0;
        long[] inp = new long[100000];
        while (r.ready()) {
            inp[prt++] = Integer.valueOf(r.readLine());
        }
        System.out.println(inp.length);
        MergeSortingS s = new MergeSortingS(inp);
        long startTime = System.currentTimeMillis();
        s.sort();
        System.out.println((System.currentTimeMillis() - startTime));
    }


}
