package org.sample;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

public class MyJavaListMimic {
    public static <T> List<T> of(T a01, T a02, T a03, T a04, T a05, T a06, T a07, T a08, T a09, T a10) {
        return MyJavaListMimic.listFromTrustedArray(a01, a02, a03, a04, a05, a06, a07, a08, a09, a10);
    }

    public static <T> List<T> ofVararg(T... elements) {
        return MyJavaListMimic.listFromTrustedArray(elements);
    }

    private static  <E> List<E> listFromTrustedArray(Object... input) {
        assert input.getClass() == Object[].class;
        for (Object o : input) { // implicit null check of 'input' array
            Objects.requireNonNull(o);
        }

        return switch (input.length) {
            case 0  -> throw new IllegalStateException();
            case 1  -> throw new IllegalStateException();
            case 2  -> throw new IllegalStateException();
            default -> (List<E>) new ListN<>(input, false);
        };
    }

    static final class ListN<E> implements List<E>, Serializable {
        private final E[] elements;

        private final boolean allowNulls;

        // caller must ensure that elements has no nulls if allowNulls is false
        private ListN(E[] elements, boolean allowNulls) {
            this.elements = elements;
            this.allowNulls = allowNulls;
        }

        @Override
        public boolean isEmpty() {
            return elements.length == 0;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public int size() {
            return elements.length;
        }

        @Override
        public E get(int index) {
            return elements[index];
        }

        @Override
        public E set(int index, E element) {
            return null;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public E remove(int index) {
            return null;
        }

        // @java.io.Serial
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        // @java.io.Serial
        private Object writeReplace() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return Arrays.copyOf(elements, elements.length);
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = elements.length;
            if (a.length < size) {
                // Make a new array of a's runtime type, but my contents:
                return (T[]) Arrays.copyOf(elements, size, a.getClass());
            }
            System.arraycopy(elements, 0, a, 0, size);
            if (a.length > size) {
                a[size] = null; // null-terminate
            }
            return a;
        }

        @Override
        public boolean add(E e) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {
        }

        @Override
        public int indexOf(Object o) {
            if (!allowNulls && o == null) {
                throw new NullPointerException();
            }
            Object[] es = elements;
            for (int i = 0; i < es.length; i++) {
                if (Objects.equals(o, es[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public int lastIndexOf(Object o) {
            if (!allowNulls && o == null) {
                throw new NullPointerException();
            }
            Object[] es = elements;
            for (int i = es.length - 1; i >= 0; i--) {
                if (Objects.equals(o, es[i])) {
                    return i;
                }
            }
            return -1;
        }

        @NotNull
        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    }
}
