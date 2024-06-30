public class Product {

    int _id;
    String _name;
    String _code;
    String _description;
    double _price;
    int _amount;

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getAmount() {
        return _amount;
    }

    public void setAmount(int amount) {
        _amount = amount;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getCode() {
        return _name.substring(0,1) + _code;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }
}
