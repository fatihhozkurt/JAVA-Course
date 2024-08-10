import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.set(3,2);

        numbers.remove(4);

        for (Object numbersIndex : numbers)
        {
            System.out.println(numbersIndex);
        }
    }
}