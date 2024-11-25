package ListTask2;

public class Node<T> {
    private T _data;

    private Node<T> _next;
    private Node<T> _previous;

    public T GetData(){
        return _data;
    }


    public void SetNext(Node<T> next){
        _next = next;
    }

    public Node<T> GetNext(){
        return _next;
    }


    public void SetPrevious(Node<T> previous){
        _previous = previous;
    }

    public Node<T> GetPrevious(){
        return _previous;
    }

    @Override
    public String toString(){
        return _data.toString();
    }


    public Node(T data) {
        super();
        _data = data;
    }
}
