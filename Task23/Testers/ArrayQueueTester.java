import Array.ArrayQueue;

public class ArrayQueueTester {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(10);
        q.enqueue(17);
        q.enqueue(1);
        q.enqueue(4);
        q.printQueue();
        System.out.println(q.size());
        System.out.println(q.element());
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.element());
        System.out.println(q.size());
        q.clear();
        q.printQueue();
        System.out.println("Пустой:" + q.isEmpty());
        q.enqueue(11);
        q.enqueue(89);
        q.printQueue();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
