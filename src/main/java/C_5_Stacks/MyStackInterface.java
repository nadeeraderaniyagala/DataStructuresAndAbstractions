package C_5_Stacks;

public interface MyStackInterface<T> {

    void push(T anEntry);

    T pop();

    T peek();

    boolean isEmpty();

    void clear();
}
