package ListTask1.Task1;

import java.util.Scanner;

public class Student {
    
    private String _name;
    
    private Student _next;


    public static Student ReadFromConsole(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
       
        String name = "SOMEONE";
        
        name = sc.nextLine();

        return new Student(name);
    }


    public String GetName(){
        return _name;
    }


    public Student GetNext(){
        return _next;
    }

    public void SetNext(Student next){
        _next = next;
    }

    @Override
    public String toString(){
        return _name;
    }



    public Student(String name) {
        _name = name;
    }

    public Student(String name, Student next) {
        _name = name;
        _next = next;
    }
}
