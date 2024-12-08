import LinkedList.LinkedQueue;

public class LinkedQueueTester {
    public static void main(String[] args) {
//        Проверка очереди на связном списке (LinkedQueue), сам связный список LinkedList
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(6);
        lq.enqueue(8);
        System.out.println(lq.element());
        System.out.println("Пустой: " + lq.isEmpty());
        System.out.println(lq.size());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.size());
        lq.enqueue(78);
        lq.enqueue(24);
        lq.enqueue(98);
        System.out.println(lq.size());
        lq.clear();
        System.out.println("Пустой: " + lq.isEmpty());
    }
}
