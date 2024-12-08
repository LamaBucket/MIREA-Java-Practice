package Abstracts;

public interface AbstractQueue<T> {
    void enqueue(T item);
    int dequeue();
    
    int size();
    
    boolean isEmpty();
    
    T element();
}
