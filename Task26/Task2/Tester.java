package Task26.Task2;

public class Tester {
    public static void main(String[] args){
        Node<Integer> nodes = new Node<Integer>(10);

        Node<Integer> current = nodes;

        for (int i = 25; i < 35; i++){
            current.SetNext(new Node<Integer>(i));
            current = current.GetNext();
        }

        while (nodes.hasNext()){
            int i = nodes.next().GetData();
            System.out.print(i + " ");
        }
    }
}
