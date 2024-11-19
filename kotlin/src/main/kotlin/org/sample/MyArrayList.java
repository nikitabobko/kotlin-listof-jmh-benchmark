package org.sample;

import kotlin.NotImplementedError;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyArrayList extends AbstractList<Integer> implements RandomAccess, java.io.Serializable {
    @java.io.Serial
    private static final long serialVersionUID = -2764017481108945198L;
    @SuppressWarnings("serial") // Conditionally serializable
    private final int[] a;

    public MyArrayList(int[] array) {
        a = Objects.requireNonNull(array);
    }

    @Override
    public int size() {
        return a.length;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        int size = size();
        if (a.length < size)
            throw new NotImplementedError();
        System.arraycopy(this.a, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public Integer get(int index) {
        return a[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        Integer oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        int[] a = this.a;
        if (o == null) {
            for (int i = 0; i < a.length; i++)
                if (a[i] == 0)
                    return i;
        } else {
            for (int i = 0; i < a.length; i++)
                if (o.equals(a[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Spliterators.spliterator(a, Spliterator.ORDERED);
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Objects.requireNonNull(action);
        for (int e : a) {
            action.accept(e);
        }
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        Objects.requireNonNull(operator);
        int[] a = this.a;
        for (int i = 0; i < a.length; i++) {
            a[i] = operator.apply(a[i]);
        }
    }

    @Override
    public void sort(Comparator<? super Integer> c) {
        throw new NotImplementedError();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayItr(a);
    }

    private static class ArrayItr implements Iterator<Integer> {
        private int cursor;
        private final int[] a;

        ArrayItr(int[] a) {
            this.a = a;
        }

        @Override
        public boolean hasNext() {
            return cursor < a.length;
        }

        @Override
        public Integer next() {
            int i = cursor;
            if (i >= a.length) {
                throw new NoSuchElementException();
            }
            cursor = i + 1;
            return a[i];
        }
    }
}
