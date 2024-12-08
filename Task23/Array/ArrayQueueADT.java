package Array;

public abstract class ArrayQueueADT {
    public int maxSize;
    public ArrayQueueADT(int size){
        maxSize = size;
        System.out.println(maxSize);
    }
    abstract void enqueue(int item);

    abstract int dequeue();

    abstract boolean isEmpty();

    abstract int size();

    abstract void clear();
    abstract int element();
}