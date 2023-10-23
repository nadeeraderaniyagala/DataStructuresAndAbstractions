package C_10_Lists;

/**
 * An Interface ADT List.
 *
 * @param <T>
 */
public interface MyListInterface<T> {

    /**
     * Adds a new entry to the end of the list
     *
     * @param newEntry The object that needs to be added as a new entry
     */
    void add(T newEntry);

    /**
     * Adds a new entry to a given position in the list
     *
     * @param newPosition An integer that specifies the desired position of the new entry
     * @param newEntry    The object that needs to be added as a new entry
     */
    void add(int newPosition, T newEntry);

    /**
     * Remove an object at a given position in the list
     *
     * @param givenPosition An integer that specifies the position of the object to be removed
     * @return A reference to the removed entry
     * @throws IndexOutOfBoundsException if givenPosition<0 or givenPosition>getLength-1
     */
    T remove(int givenPosition);

    /**
     * Removes all entries in the list
     */
    void clear();

    /**
     * Replaces an entry to a given position in the list
     *
     * @param givenPosition An integer that specifies the desired position of the entry to be replaced
     * @param newEntry      The object that needs to be inserted
     * @return A reference to the replaced entry
     * @throws IndexOutOfBoundsException if givenPosition<0 or givenPosition>getLength-1
     */
    T replace(int givenPosition, T newEntry);

    /**
     * Retrieves an entry to a given position in the list
     *
     * @param givenPosition An integer that specifies the desired position of the entry to be retrieved
     * @return A reference to the retrieved entry
     * @throws IndexOutOfBoundsException if givenPosition<0 or givenPosition>getLength-1
     */
    T getEntry(int givenPosition);

    /**
     * Retrieves all entries that are in the list in order of which they occure
     *
     * @return A newly allocated array if all the entries in the list
     * if the list is empty , the returned array is empty
     */
    T[] toAArray();

    /**
     * See if there is a given entry in the list
     *
     * @param anEntry The desired object
     * @return True is the list contains anEntry , false if not
     */
    boolean contains(T anEntry);

    /**
     * Gets the length of the list
     *
     * @return An integer number of entries in the list
     */
    int getLength();

    /**
     * Sees whether the list is empty
     *
     * @return True is the list is empty , false if not
     */
    boolean isEmpty();

}
