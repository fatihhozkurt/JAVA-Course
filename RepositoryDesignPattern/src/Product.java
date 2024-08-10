public class Product implements IEntity{

    int id;
    String name;
    String surname;

    public Product(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}
