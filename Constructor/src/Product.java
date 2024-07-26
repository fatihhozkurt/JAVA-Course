public class Product {

    public Product(int id, String name, String description, String code, double price, int amount)
    {
        _id = id;
        _name = name;
        _description = description;
        _code = code;
        _price = price;
        _amount = amount;
    }

    private int _id;
    private String _name;
    private String _description;
    private String _code;
    private double _price;
    private int _amount;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        _id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        _description = description;
    }

    public String get_code() {
        return _code;
    }

    public void set_code(String code) {
        _code = code;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        _price = price;
    }

    public int get_amount() {
        return _amount;
    }

    public void set_amount(int amount) {
        _amount = amount;
    }
}
