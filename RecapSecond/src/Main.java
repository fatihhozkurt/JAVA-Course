//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.2,4.4,3.1,1.1,1.8};

        double max = numbers[0];
        double total = 0;

        for(double numberIndex: numbers)
        {
            if (max < numberIndex)
            {
                max = numberIndex;
            }

            total += numberIndex;

            System.out.println(numberIndex);
        }
        System.out.println("Max value is " + max + "\n" + "Total is " + total);
    }
}