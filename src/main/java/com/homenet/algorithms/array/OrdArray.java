package com.homenet.algorithms.array;

/**
 * @author denis.bilyk
 */
public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) // Найти не удалось
            return false;
        else // Элемент найден
        {
            for (int k = j; k < nElems; k++) // Перемещение последующих элементов
                a[k] = a[k + 1];
            nElems--; // Уменьшение размераРеализация упорядоченного массива на языке Java 71
            return true;
        }
    }


    public void display() // Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++) // Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }


    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) // Определение позиции вставки
            if (a[j] > value) // (линейный поиск)
                break;
        for (int k = nElems; k > j; k--) // Перемещение последующих элементов
            a[k] = a[k - 1];
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }

    public void insertBi(long value) {

    }


    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            }
            if (lowerBound > upperBound) {
                return nElems;
            }
            if (a[curIn] < searchKey) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }

    }
}
