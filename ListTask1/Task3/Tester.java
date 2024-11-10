package ListTask1.Task3;

public class Tester {
    public static void main(String[] args) {
        CircledLinkedList container = new CircledLinkedList();

        for(int i = 0; i < 3; i++){
            container.AddStudent();
        }

        System.out.println(container.toString());


        System.out.println(container.GetNthStudent(2).toString());


        container.RemoveStudent(2);
        System.out.println(container.toString());

        container.Clear();
        System.out.println(container.toString());
        System.out.println(container.IsEmpty());

    }
}
