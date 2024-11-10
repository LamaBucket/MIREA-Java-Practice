package ListTask1.Task2;

public class TwoWayLinkedStudentContainer {
    private TwoWayLinkedStudent _first;


    public void AddStudent(){
        TwoWayLinkedStudent student = TwoWayLinkedStudent.ReadFromConsole();

        if(FirstIsNull()){
            _first = student;
            return;
        }

        TwoWayLinkedStudent last = GetLast();
        last.SetNext(student);
        student.SetPrevious(last);
    }

    private TwoWayLinkedStudent GetLast(){
        if(FirstIsNull()){
            return null;
        }

        TwoWayLinkedStudent current = _first;

        while(current.GetNext() != null){
            current = current.GetNext();
        }

        return current;
    }


    public TwoWayLinkedStudent GetNthStudent(int n){
        if(FirstIsNull()){
            return null;
        }

        if(n == 0){
            return _first;
        }

        TwoWayLinkedStudent previous = GetNthParent(n);
        
        return previous.GetNext();
    }


    public void RemoveStudent(int n){
        if(n == 0){
            _first = _first.GetNext();
            _first.SetPrevious(null);
            return;
        }

        TwoWayLinkedStudent previous = GetNthParent(n);

        if(previous == null){
            return;
        }

        TwoWayLinkedStudent newNext = previous.GetNext();

        if(newNext != null){
            newNext = newNext.GetNext();
        }
        else{
            System.err.println("Stack Overflow...");
            return;
        }

        previous.SetNext(newNext);
        
        if(newNext != null){
            newNext.SetPrevious(previous);
        }
    }

    private boolean FirstIsNull(){
        return _first == null;
    }

    private TwoWayLinkedStudent GetNthParent(int n){
        if(FirstIsNull()){
            return null;
        }

        if(n <= 0){
            return null;
        }

        TwoWayLinkedStudent previous = _first;
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
        TwoWayLinkedStudent current = _first;

        StringBuilder sb = new StringBuilder();

        while(current != null){
            sb.append(" -> " + current.toString());
            current = current.GetNext();
        }

        sb.delete(0, 3);

        return sb.toString();
    }

    public TwoWayLinkedStudentContainer(){
        _first = null;
    }
}
