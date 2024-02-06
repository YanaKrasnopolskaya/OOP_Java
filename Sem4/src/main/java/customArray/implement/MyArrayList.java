package customArray.implement;

import customArray.ArrayIterator;
import customArray.MyArrList;

import java.util.Iterator;

public class MyArrayList<T> implements MyArrList<T> {

    private T[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 2;
        this.size = 0;
        this.array =(T[]) new Object[capacity];
    }

    private void addCapacity(){
        T[] newArray = (T[]) new Object[capacity*2];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

    @Override
    public void add(T element) {
        if(size == capacity){
            addCapacity();
        }
        array[size]=element;
        size++;
    }

    @Override
    public void remove(int index) {
        T[] newArray= (T[]) new Object[size];
        System.arraycopy(array,0,newArray,0,index);
        int amountElementAfterIndex = array.length-index-1;
        System.arraycopy(array,index+1,newArray,index,amountElementAfterIndex);
        array=newArray;
        size--;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int idx = 0;
        while (idx != size) {
            sb.append(array[idx]).append(",");
            idx++;
        }
        if (sb.length() == 1) return "{}";
        sb.deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }
}
