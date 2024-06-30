//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,9,11,13};
        int wanted = 4;

        for (int numberIndex: numbers){
            if (numberIndex == wanted)
            {
                System.out.println(wanted + " founded");
                return;
            }
        }
        System.out.println("Number cannot be founded");
    }
}