package ListTask1.Task1;

public class StudentContainer {
    private Student _first;


    public void AddStudent(){
        Student student = Student.ReadFromConsole();

        if(FirstIsNull()){
            _first = student;
            return;
        }

        GetLast().SetNext(student);
    }

    private Student GetLast(){
        if(FirstIsNull()){
            return null;
        }

        Student current = _first;

        while(current.GetNext() != null){
            current = current.GetNext();
        }

        return current;
    }


    public Student GetNthStudent(int n){
        if(FirstIsNull()){
            return null;
        }

        if(n == 0){
            return _first;
        }

        Student previous = GetNthParent(n);
        
        return previous.GetNext();
    }


    public void RemoveStudent(int n){
        if(n == 0){
            _first = _first.GetNext();
            return;
        }

        Student previous = GetNthParent(n);

        if(previous == null){
            return;
        }

        Student newNext = previous.GetNext();

        if(newNext != null){
            newNext = newNext.GetNext();
        }
        else{
            System.err.println("Stack Overflow...");
            return;
        }

        previous.SetNext(newNext);
    }

    private boolean FirstIsNull(){
        return _first == null;
    }

    private Student GetNthParent(int n){
        if(FirstIsNull()){
            return null;
        }

        if(n <= 0){
            return null;
        }

        Student previous = _first;
        int i = 1;

        while(i != n && previous.GetNext() != null){
            previous = previous.GetNext();
            i++;
        }

        if(i != n){
            System.err.println("Stack Overflow...");
        }

        return previous;
    }


    public void Clear(){
        _first = null;
    }

    public boolean IsEmpty(){
        return _first == null;
    }

    @Override
    public String toString(){
        Student current = _first;

        StringBuilder sb = new StringBuilder();

        while(current != null){
            sb.append(" -> " + current.toString());
            current = current.GetNext();
        }

        sb.delete(0, 3);

        return sb.toString();
    }

    public StudentContainer(){
        _first = null;
    }
}
