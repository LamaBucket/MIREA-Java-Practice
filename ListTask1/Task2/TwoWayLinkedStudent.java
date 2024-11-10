package ListTask1.Task2;

import java.util.Scanner;

public class TwoWayLinkedStudent {

    private String _name;
    
    private TwoWayLinkedStudent _next;

    private TwoWayLinkedStudent _previous;


    public String GetName(){
        return _name;
    }


    public TwoWayLinkedStudent GetNext(){
        return _next;
    }

    public TwoWayLinkedStudent GetPrevious(){
        return _previous;
    }


    public void SetNext(TwoWayLinkedStudent next){
        _next = next;
    }

    public void SetPrevious(TwoWayLinkedStudent previous){
        _previous = previous;
    }

    
    public static TwoWayLinkedStudent ReadFromConsole(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
       
        String name = "SOMEONE";
        
        name = sc.nextLine();

        return new TwoWayLinkedStudent(name);
    }

    @Override
    public String toString(){
        String addText = _previous == null ? "" : " (Previous is: " + _previous._name + ")";
        
        return _name + addText;
    }


    public TwoWayLinkedStudent(String name, TwoWayLinkedStudent next) {
        _name = name;
        _next = next;
    }

    public TwoWayLinkedStudent(String name) {
        _name = name;
    }
    
}
