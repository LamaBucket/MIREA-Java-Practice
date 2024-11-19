package Task11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String _name;
    private String _surname;

    private Date _dateBorn;


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    
    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }


    public Date get_dateBorn() {
        return _dateBorn;
    }
    
    public void set_dateBorn(Date _dateBorn) {
        this._dateBorn = _dateBorn;
    }


    public String toString(String pattern){
        DateFormat df = new SimpleDateFormat(pattern);

        String result = "Student " + _name + " " + _surname + " Was Born On " + df.format(_dateBorn);

        return result;
    }

    public Student(String _name, String _surname, Date _dateBorn) {
        this._name = _name;
        this._surname = _surname;
        this._dateBorn = _dateBorn;
    }

}
