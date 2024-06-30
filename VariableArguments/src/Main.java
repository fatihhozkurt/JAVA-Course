//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int result = addition();
        System.out.println(result);
    }

    public static int addition(int... numbers)
    {
        int total = 0;
        for (int numberIndex: numbers)
        {
            total += numberIndex;
        }
        return total;
    }
}