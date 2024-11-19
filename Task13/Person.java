package Task13;

public class Person {
    private String _name;
    private String _surname;
    private String _patronymic;


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


    public String get_patronymic() {
        return _patronymic;
    }

    public void set_patronymic(String _patronymic) {
        this._patronymic = _patronymic;
    }


    @Override
    public String toString(){
        return _name + _surname != null ? " " + _surname : "" + _patronymic != null ? " " + _patronymic : "";
    }

    public Person(String _surname) {
        this._surname = _surname;
    }
}
