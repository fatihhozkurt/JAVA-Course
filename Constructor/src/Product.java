public class Product {

    public Product(int id, String name, String description, String code, double price, int amount) {
        _id = id;
        _name = name;
        _description = description;
        _code = code;
        _price = price;
        _amount = amount;
    }

    public Product() {

    }

    private int _id;
    private String _name;
    private String _description;
    private String _code;
    private double _price;
    private int _amount;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getCode() {
        return _name.substring(0, 1) + _code;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public int getAmount() {
        return _amount;
    }

    public void setAmount(int _amount) {
        this._amount = _amount;
    }
}
