//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        System.out.println("\n-------------------\n");

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        array2 = array1;
        array1[0] = 7;
        for (int arrayIndex : array2) {
            System.out.println(arrayIndex);
        }
    }
}