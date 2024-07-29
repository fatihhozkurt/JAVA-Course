public class Product implements IEntity{

    public Product(int id, String name)
    {
        _id = id;
        _name = name;
    }

    private int _id;
    private String _name;

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

}
