//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product tv = new Product();
        Product phone = new Product();
        ProductManager productManager1 = new ProductManager();

        phone.color = "White";
        phone.category = "Electronics";
        phone.price = 2000;
        phone.name = "Samsung Phone";
        phone.amount = 4;

        tv.color = "Black";
        tv.category = "Electronics";
        tv.price = 1000;
        tv.name = "Samsung TV";
        tv.amount = 2;

        productManager1.add(tv);
        productManager1.delete(phone);
    }
}


