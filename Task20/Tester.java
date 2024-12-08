package Task20;

import java.io.Serializable;

public class Tester<T extends Comparable<String>, K extends Serializable, V extends Animal > {
    private T _param1;
    private K _param2;
    private V _param3;

    public void Print(){
        System.out.println(_param1.getClass().getName());
        System.out.println(_param2.getClass().getName());
        System.out.println(_param3.getClass().getName());
    }

    public Tester(T _param1, K _param2, V _param3) {
        this._param1 = _param1;
        this._param2 = _param2;
        this._param3 = _param3;
    }
}
