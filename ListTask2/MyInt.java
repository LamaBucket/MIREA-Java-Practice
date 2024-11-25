package ListTask2;

public class MyInt implements Comparable<MyInt>{
    public int Value;

    public MyInt(int val) {
        super();
        Value = val;
    }

    @Override
    public int compareTo(MyInt o) {
        if(Value >= o.Value){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return String.valueOf(Value);
    }
}
