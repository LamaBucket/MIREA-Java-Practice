package LinkedList;

public class LinkedQueue {
    Node front;
    Node rear;

    public LinkedQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public void enqueue(int newData){
        Node current = new Node(newData);
        if (rear == null){
            front = rear = current;
        }
        rear.next = current;
        rear = current;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Очередь пустая");
        }
        Node tmp = front;
        front = front.next;
        if (front == null){
            rear = null;
        }
        System.out.println("Удален: ");
        return tmp.getDate();
    }

    public int element(){
        if (isEmpty()){
            System.out.println("Очередь пустая");
        }
        System.out.println("Первый элемент: ");
        return front.getDate();
    }

    public int size(){
        Node current;
        current = front;
        int size = 1;
        if (current == null){
            size = 0;
        }
        else {
            while (current.getNext() != null) {
                current = current.getNext();
                size += 1;
            }
        }
        System.out.println("Размер: ");
        return size;
    }

    public void clear(){
        System.out.println("Очищаем очередь");
        if (front == null && rear == null){
            System.out.println("Список пустой");
        }
        else{
            while (front != null){
                System.out.println(this.dequeue());
            }
        }
        System.out.println("Очередь очищена");
    }
}
