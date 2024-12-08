package Array;
public class ArrayQueueADTInteger extends ArrayQueueADT{
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;
    public ArrayQueueADTInteger(int size)  {
        super(size);
        this.maxSize = super.maxSize;
        System.out.println(maxSize);
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        count = 0;
    }
    public void enqueue(int item){
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
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public int size(){
        return count;
    }

    public int element(){
        System.out.println("Первый элемент:");
        return queueArray[front];
    }

    public void clear(){
        System.out.println("Очищаем очередь");
        while (count != 0){
            System.out.println(this.dequeue());
        }
        rear = -1;
        front = -1;
    }
    public int dequeue(){
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
    public void printQueue(){
        System.out.println("Выводим очередь:");
        for (int i = 0; i < count; i++){
            System.out.println(queueArray[i]);
        }
        System.out.println("Очередь выведена");
    }
}
