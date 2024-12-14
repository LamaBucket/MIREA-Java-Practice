package Task26.Task2;

import java.util.Iterator;

public class Node<T> implements Iterator<Node<T>> {
    private T _data;

    private Node<T> _next;
    private Node<T> _previous;

    public Node<T> _currentIterable = this;

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


    @Override
    public boolean hasNext() {
        return _next != null;
    }


    @Override
    public Node<T> next() {
       if(_currentIterable._next != null){
            _currentIterable = _currentIterable._next;

            return _currentIterable;
        }

        return null;
    }
}
