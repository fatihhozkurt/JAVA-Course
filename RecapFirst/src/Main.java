//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 450;
        int number3 = 300;
        int max = number1;

        if (max <= number2) {
            max = number2;
        }
        if (max <= number3) {
            max = number3;
        }

        System.out.println("Higher value is: " + max);
    }
}