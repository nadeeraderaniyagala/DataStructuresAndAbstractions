package C_10_Lists;

import java.util.Arrays;

public class AList<T> implements MyListInterface<T> {
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;
    private T[] list;
    private int numOfEntries;

    public AList() {
        this(DEFAULT_CAPACITY);
    }

    public AList(int initialCapacity) {
        if (initialCapacity < DEFAULT_CAPACITY) {
            initialCapacity = DEFAULT_CAPACITY;
        } else checkCapacity(initialCapacity);

        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[initialCapacity + 1];
        list = tempList;
        numOfEntries = 0;

    }

    private static void checkCapacity(int initialCapacity) {
        if (initialCapacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a list whose capacity exceeds allowed maximun of " + MAX_CAPACITY);
        }
    }

    @Override
    public void add(T newEntry) {
        list[numOfEntries + 1] = newEntry;
        numOfEntries++;

    }

    @Override
    public void add(int newPosition, T newEntry) {
        if (newPosition >= 1 && newPosition <= numOfEntries + 1) {
            if (newPosition <= numOfEntries) {
                //  makeRoom(newPosition);
            }

        }

    }

    @Override
    public T remove(int givenPosition) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public T replace(int givenPosition, T newEntry) {
        return null;
    }

    @Override
    public T getEntry(int givenPosition) {
        return null;
    }

    @Override
    public T[] toAArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numOfEntries];
        for (int i = 0; i < numOfEntries; i++) {
            result[i] = list[i + 1];
        }
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public int getLength() {
        return numOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numOfEntries == 0;
    }

    private void ensureCapacity() {
        int capacity = list.length - 1;
        if (numOfEntries >= capacity) {
            int newCapacity = capacity * 2;
            checkCapacity(newCapacity);
            list = Arrays.copyOf(list, newCapacity);
        }
    }
}
