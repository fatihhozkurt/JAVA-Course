public class Customer {

    public Customer(int id, String name, String surname, int age)
    {
        _surname = surname;
        _id = id;
        _name = name;
        _age = age;
    }

    private int _id;
    private String _name;
    private String _surname;
    private int _age;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String surname) {
        _surname = surname;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int age) {
        _age = age;
    }
}
