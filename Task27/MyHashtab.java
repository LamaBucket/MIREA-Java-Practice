package Task27;

import java.util.HashMap;
import java.util.Map;

public class MyHashtab<T, K> {
    private Map<T,K> _table;

    public static <T,K> MyHashtab<T,K> HashInit(){
        return new MyHashtab<T,K>();
    }

    public void Add(T key, K value){
        _table.put(key, value);
    }

    public K Lookup(T key){
        return _table.getOrDefault(key, null);
    }

    public boolean Delete(T key){
        if(_table.containsKey(key)){
            _table.remove(key);
            return true;
        }
        return false;
    }

    private MyHashtab(){
        _table = new HashMap<T,K>();
    }
}
