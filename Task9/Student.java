package Task9;

public class Student implements Comparable<Student> {
    public int mark;

    public String name;


    public Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
        return mark == o.mark ? 0 : (mark < o.mark ? -1 : 1);
    }
}
