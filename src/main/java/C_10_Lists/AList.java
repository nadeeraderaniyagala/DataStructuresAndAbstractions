package C_10_Lists;

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
        } else if (initialCapacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a list whose capacity exceeds allowed maximun of " + MAX_CAPACITY);
        }

        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[initialCapacity + 1];
        list = tempList;
        numOfEntries = 0;

    }

    @Override
    public void add(T newEntry) {
        list[numOfEntries + 1] = newEntry;
        numOfEntries++;

    }

    @Override
    public void add(int newPosition, T newEntry) {

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
            result
        }
        return null;
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
        return false;
    }
}
