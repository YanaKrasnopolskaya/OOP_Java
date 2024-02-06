package customArray;

public interface MyArrList<T> extends Iterable<T> {
    void add(T element);

    void remove(int index);

    T get(int index);

    int size();

}
