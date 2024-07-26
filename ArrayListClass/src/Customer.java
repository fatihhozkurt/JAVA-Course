public class Customer {

    private int _id;
    private String _name;
    private String _surname;

    public Customer(int id, String name, String surname)
    {
        _id = id;
        _name = name;
        _surname = surname;
    }

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
}
