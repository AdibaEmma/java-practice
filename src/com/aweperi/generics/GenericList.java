package com.aweperi.generics;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
