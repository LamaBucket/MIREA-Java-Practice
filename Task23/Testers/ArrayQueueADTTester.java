import Array.ArrayQueueADTInteger;

public class ArrayQueueADTTester {
    public static void main(String[] args) {
        ArrayQueueADTInteger taq = new ArrayQueueADTInteger(5);
        taq.enqueue(6);
        taq.enqueue(10);
        taq.enqueue(4);
        System.out.println(taq.dequeue());
        System.out.println(taq.dequeue());
        System.out.println("Пустой: " + taq.isEmpty());
        System.out.println(taq.dequeue());
        System.out.println(taq.size());
        taq.enqueue(78);
        taq.printQueue();

    }
}
