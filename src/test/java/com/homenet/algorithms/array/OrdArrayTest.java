package com.homenet.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OrdArrayTest {
    private OrdArray arr;


    @Test
    public void findTest() {
        arr = new OrdArray(51);
        fillArray();
        int searchKey = 55;
        assertNotEquals(51, arr.find(searchKey));
        assertEquals(10, arr.size());
        arr.insert(35);

    }


    private void fillArray() {
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
    }


}