package ListTask2;

public class TwoWayLinkedList<T> {
    private Node<T> _first;


    public static <K extends Comparable<K>> void Sort(TwoWayLinkedList<K> list){
        int i = 0;
        int j = 0;
        int n = list.Length();
        boolean swapped;


        for (i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (j = 0; j < n - i - 1; j++) {
                var current = list.Get(j);
                var next = current.GetNext();

                if (current.GetData().compareTo(next.GetData()) > 0) {
                    
                    SwapWithNext(list, j);

                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

    
    }

    public static <K> void SwapWithNext(TwoWayLinkedList<K> list, int j){        
        var left = list.Get(j);
        var right = left.GetNext();
        var prev = left.GetPrevious();
        var next = right.GetNext();


        prev.SetNext(right);
        right.SetNext(left);
        left.SetNext(next);

        next.SetPrevious(left);
        left.SetPrevious(right);
        right.SetPrevious(prev);

        if(j == 0){
            list._first = right;
        }
    }


    public int Length(){
        int n = 0;
        var current = _first;

        while(current.GetNext() != _first){
            n += 1;
            current = current.GetNext();
        }

        return n;
    }


    public void Add(T item){
        Node<T> node = new Node<T>(item);


        if(FirstIsNull()){
            _first = node;

            _first.SetNext(node);
            _first.SetPrevious(node);
            
            return;
        }

        Node<T> last = GetLast();
        last.SetNext(node);
        node.SetPrevious(last);

        node.SetNext(_first);
        _first.SetPrevious(node);
    }

    private Node<T> GetLast(){
        if(FirstIsNull()){
            return null;
        }

        return _first.GetPrevious();
    }


    public Node<T> Get(int n){
        if(FirstIsNull()){
            return null;
        }

        if(n < 0){
            return null;
        }

        int i = 0;

        Node<T> result = _first;
        
        while(i != n){
            result = result.GetNext();            
            i += 1;
        }
        
        return result;
    }


    public void Remove(int n){
        
        if(_first.GetNext() == _first){
            _first = null;
            return;
        }
        
        if(n == 0){
            Node<T> prev = _first.GetPrevious();

            _first = _first.GetNext();
            
            _first.SetPrevious(prev);
            prev.SetNext(_first);
            return;
        }

        Node<T> toRemove = Get(n);

        var newPrevious = toRemove.GetPrevious();
        var newNext = toRemove.GetNext();

        newPrevious.SetNext(newNext);
        newNext.SetPrevious(newPrevious);
    }

    private boolean FirstIsNull(){
        return _first == null;
    }

    public void Clear(){
        _first = null;
    }

    public boolean IsEmpty(){
        return _first == null;
    }

    @Override
    public String toString(){
        var current = _first;

        String res = "";

        while(current.GetNext() != _first){
            
            res += current.toString() + "\n";
            
            current = current.GetNext();
        }

        return res;
    }

    public TwoWayLinkedList(){
        _first = null;
    }
}
