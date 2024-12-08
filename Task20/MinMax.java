package Task20;

public class MinMax<T extends Comparable<T>> {
    T[] _arr;

    public T FindMax(){
        if(_arr.length == 0){
            return null;
        }

        T max = _arr[0];

        for(int i = 1; i < _arr.length; i++){
            if(_arr[i].compareTo(max) > 0){
                max = _arr[i];
            }
        }

        return max;
    }


    public T FindMin(){
        if(_arr.length == 0){
            return null;
        }

        T min = _arr[0];

        for(int i = 1; i < _arr.length; i++){
            if(_arr[i].compareTo(min) < 0){
                min = _arr[i];
            }
        }

        return min;
    }

    public MinMax(T[] _arr) {
        this._arr = _arr;
    }
}
