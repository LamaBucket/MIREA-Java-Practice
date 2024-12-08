package LinkedList;

public class Node {
   int data;
   Node next;

   public Node(int newData){
       this.data = newData;
       this.next = null;
   }
   public Node(){}
   public int getDate(){
       return this.data;
   }
   public Node getNext(){
       return next;
   }
}
