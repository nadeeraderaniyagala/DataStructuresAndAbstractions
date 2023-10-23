package C_10_Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that implements a list of object using ArrayList
 * Duplicate entries are allowed
 *
 * @param <T>
 */
public class MyList<T> implements MyListInterface<T> {

    List<T> mylist;

    public MyList() {
        this.mylist = new ArrayList<>();
    }

    @Override
    public void add(T newEntry) {
        mylist.add(newEntry);
    }

    @Override
    public void add(int newPosition, T newEntry) {
        mylist.add(newPosition, newEntry);
    }

    @Override
    public T remove(int givenPosition) {
        return mylist.remove(givenPosition);
    }

    @Override
    public void clear() {
        mylist.clear();
    }

    @Override
    public T replace(int givenPosition, T newEntry) {
        return mylist.set(givenPosition, newEntry);
    }

    @Override
    public T getEntry(int givenPosition) {
        return mylist.get(givenPosition);
    }


    @SuppressWarnings("unchecked")
    @Override
    public T[] toAArray() {
        return (T[]) mylist.toArray();
    }

    @Override
    public boolean contains(T anEntry) {
        return mylist.contains(anEntry);
    }

    @Override
    public int getLength() {
        return mylist.size();
    }

    @Override
    public boolean isEmpty() {
        return mylist.isEmpty();
    }
}
