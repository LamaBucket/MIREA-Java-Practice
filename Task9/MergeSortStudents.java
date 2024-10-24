package Task9;

public class MergeSortStudents {
    
    public static Student[] Sort(Student[] arr1, Student[] arr2){
        SortingStudentsByGPA arrSorter1 = new SortingStudentsByGPA(arr1);
        SortingStudentsByGPA arrSorter2 = new SortingStudentsByGPA(arr2);
        
        arrSorter1.Sort();
        arrSorter2.Sort();

        Student[] arr3 = new Student[arr1.length + arr2.length];

        int i=0, j=0;
        for (int k=0; k < arr3.length; k++) {
    
            if (i > arr1.length - 1) {
                Student a = arr2[j];
                arr3[k] = a;
                j++;
            }
            else if (j > arr2.length - 1) {
                Student a = arr1[i];
                arr3[k] = a;
                i++;
            }
            else if (arr1[i].mark < arr2[j].mark) {
                Student a = arr1[i]; 
                arr3[k] = a;
                i++;
            }
            else {
                Student b = arr2[j];
                arr3[k] = b;
                j++;
            }
        }

        return arr3;
    }

   

}
