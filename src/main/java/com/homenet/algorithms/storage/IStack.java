package com.homenet.algorithms.storage;

/**
 * @author denis.bilyk
 */
public interface IStack<T> {

    void push(T value);

    T pop();

    T peek();

}
