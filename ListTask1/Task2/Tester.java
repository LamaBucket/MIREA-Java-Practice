package ListTask1.Task2;

public class Tester {
    public static void main(String[] args) {
        TwoWayLinkedStudentContainer container = new TwoWayLinkedStudentContainer();

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
