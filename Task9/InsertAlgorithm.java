package Task9;

public class InsertAlgorithm {
    
    public static void Sort(Student[] students){
        for (int i = 1; i < students.length; i++){
            Student swap = students[i];
            int j;
            for (j = i; j > 0 && swap.mark < students[j-1].mark; j--){
                students[j] = students[j-1];
            }
            students[j] = swap;
        }
    }
    
}
