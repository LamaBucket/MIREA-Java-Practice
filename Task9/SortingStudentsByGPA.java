package Task9;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
   
    private Student[] _students;

    SortingStudentsByGPA(Student[] students){
        _students = students;
    }

    
    public void Sort() {
        quickSort(_students, 0, _students.length - 1);
    }

    private void quickSort(Student[] array, int begin, int end){
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private int partition(Student[] array, int begin, int end){
        
        Student pivot = array[end];

        int i = (begin-1);

        for (int j = begin; j < end; j ++){

            int compareResult = compare(array[j], pivot);
            
            if (compareResult == 1){
                i ++;
                Student swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        Student swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;
        return i + 1;
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.mark <= o2.mark ? 1 : 0;
    }
    
}
