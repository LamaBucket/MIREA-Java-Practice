package Array;

import Abstracts.AbstractQueue;

public class ArrayQueue implements AbstractQueue<Integer> {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;
    
    public void enqueue(Integer item)    {
        if (isEmpty()){
            front = 0;
            rear = 0;
            queueArray[rear] = item;
            count += 1;
        }
        else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Cannot enqueue.");
                count = rear + 1;
                rear = (rear - 1 + maxSize) % maxSize;
            }
            else {
                queueArray[rear] = item;
                count += 1;
            }
        }
    }

    public int dequeue()
    {
        int item = -1;
        if (!isEmpty()){
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
                count = 0;
            }
            else {
                front = (front + 1) % maxSize;
                count -= 1;
            }
        }
        else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        System.out.println("Удален: ");
        return item;
    }


    public int peek()
    {
            if (!isEmpty())
        {
            return queueArray[front];
        }
            else
        {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
    }


    public boolean isEmpty() {
        //System.out.print("Пустой: ");
        return front == -1 && rear == -1;
    }


    public int size(){
        System.out.println("Размер:");
        return count;
    }


    public Integer element(){
        if (isEmpty()){
            System.out.println("Очередь пустая");
            return -1;
        }
        else {
            System.out.println("Первый элемент:");
            return queueArray[front];
        }
    }

    public void printQueue(){
        System.out.println("Выводим очередь:");
        for (int i = 0; i < count; i++){
            System.out.println(queueArray[i]);
        }
        System.out.println("Очередь выведена");
    }
    
    public void clear(){
        System.out.println("Очищаем очередь");
        while (count != 0){
            System.out.println(this.dequeue());
        }
        front = -1;
        rear = -1;
    }

    
    public ArrayQueue(int size)    {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        count = 0;
    }
}
