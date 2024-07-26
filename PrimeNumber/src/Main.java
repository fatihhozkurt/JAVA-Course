//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int number = 56;

        if (number < 2)
        {
            if (number == 1)
            {
                System.out.println(number + " is not a prime number.");
            }
            else
            {
                System.out.println("Invalid number");
            }
        }

        for (int i = 2; i<number; i++)
        {
            if ((i != 2) && (number%i == 0))
            {
                System.out.println(number + " number is not a prime number.");
            }
            else
            {
                System.out.println(number + " number is a prime number");
            }
        }

    }
}