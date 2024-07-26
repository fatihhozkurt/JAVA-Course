import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();

        sayilar.add(15);
        sayilar.add(225);
        sayilar.add("Fatih");

        System.out.println(sayilar.size());

        sayilar.set(0, 1000);

        sayilar.remove(2);

        sayilar.clear();

        for (Object sayilarIndex : sayilar)
        {
            System.out.println(sayilarIndex);
        }



    }
}