package com.homenet.algorithms;

import com.homenet.algorithms.sorting.sorting.BubbleSorting;
import com.homenet.algorithms.sorting.sorting.InsertionSorting;
import com.homenet.algorithms.sorting.sorting.SelectionSorting;

/**
 * @author denis.bilyk
 */
public class Tester {


    public static void main(String[] args) {
        BubbleSorting bubbleSorting = new BubbleSorting(10);
        bubbleSorting.fillWith(10);
        bubbleSorting.sort();
        bubbleSorting.print();

        SelectionSorting selectionSorting = new SelectionSorting(10);
        selectionSorting.fillWith(10);
        selectionSorting.sort();
        selectionSorting.print();

        InsertionSorting insertionSorting = new InsertionSorting(10);
        insertionSorting.fillWith(10);
        insertionSorting.sort();
        insertionSorting.print();
    }


}