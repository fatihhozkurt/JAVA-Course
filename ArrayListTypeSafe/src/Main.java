import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Sakarya");
        cities.add("İstanbul");
        cities.add("Bursa");
        cities.add("Ankara");

        cities.remove("Bursa");

        Collections.sort(cities);

        for (String citiesIndex : cities)
        {
            System.out.println(citiesIndex);
        }
    }
}