package Task9; 

public class Main {
    public static void main(String[] args){

        Student[] sorted1 = CreateArray();
        Student[] sorted2 = CreateArray();
        Student[] sorted3;

        //Первая сортировка
        InsertAlgorithm.Sort(sorted1); 
        
        System.out.println("First Sort Result:");
        PrintArray(sorted1);

        //Вторая сортировка
        SortingStudentsByGPA sorter = new SortingStudentsByGPA(sorted2);
        sorter.Sort();
        sorted2 = ReverseArray(sorted2);

        System.out.println("Second Sort Result:");
        PrintArray(sorted2);


        //Третья сортировка
        sorted3 = MergeSortStudents.Sort(CreateArray(), CreateArray());

        System.out.println("Third Sort Result:");
        PrintArray(sorted3);

        //Задание 4 (реализация Comparable интерфейса лежит в Student.java (класс Student реализовывает этот интерфейс))
    }

    public static Student[] CreateArray(){
        Student[] array = new Student[5];
        array[0] = new Student("Gleb", 99);
        array[1] = new Student("Ilzira", 54);
        array[2] = new Student("Gosha", 78);
        array[3] = new Student("Anna", 68);
        array[4] = new Student("Chelovek", 44);

        return array;
    }

    public static void PrintArray(Student[] arr){
        for(Student element : arr){
            System.out.print(element.name + " ");
            System.out.println(element.mark);
        }
    }

    public static Student[] ReverseArray(Student[] arr){
        Student[] reversed = new Student[arr.length];

        int a = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reversed[a] = arr[i];
            a++;
        }

        return reversed;
    }
}
