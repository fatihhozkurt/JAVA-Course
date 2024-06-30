//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 2;

        if (number<2)
        {
            if (number == 1)
            {
                System.out.println(number + " is not a prime number");
                return;
            }
            else
            {
                System.out.println("Invalid number");
                return;
            }

        }


        for (int i = 2; i<number; i++)
        {
            if (number != 2 && number%i == 0)
            {
                System.out.println(number + " is not a prime number");
                return;
            }
        }
        System.out.println(number + " is a prime number");
    }
}