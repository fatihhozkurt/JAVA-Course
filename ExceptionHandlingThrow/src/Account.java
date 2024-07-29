public class Account {

    private final int _id;
    private String _name;
    private String _surname;
    private final String _tc;
    private float _balance;

    public Account(int id, String name, String surname, String tc, float balance)
    {
        _id = id;
        _balance = balance;
        _surname = surname;
        _name = name;
        _tc = tc;
    }

    public int get_id() {
        return _id;
    }

    public String get_tc() {
        return _tc;
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

    public float get_balance() {
        return _balance;
    }

    public void set_balance(float balance) {
        _balance = balance;
    }
}
