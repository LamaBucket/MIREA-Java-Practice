package ListTask2;

public class Main {
    
    public static void main(String[] args) {
        TwoWayLinkedList<MyInt> list = new TwoWayLinkedList<MyInt>();

        for(int i = 5; i >= 0; i--){
            list.Add(new MyInt(i));
        }

        System.out.println(list.toString());

        System.out.println("Now Sorting...");

        TwoWayLinkedList.Sort(list);

        System.out.println(list.toString());
    }
}
