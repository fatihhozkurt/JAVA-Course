//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 28;
        int total = 0;

        for (int i = 1; i<number; i++)
        {
            if(number%i == 0)
            {
                total += i;
            }
        }
        if (number == total)
        {
            System.out.println("Holy sh*t bro that's a perfect number");
        }
        else
        {
            System.out.println("N'a bro that's not even a perfect number");
        }

    }
}