//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number1 = 284;
        int number2 = 220;
        int number1Total = 0;
        int number2Total = 0;

        for (int i = 1; i<number1; i++)
        {
            if (number1%i == 0)
            {
                number1Total += i;
            }
        }

        for (int i = 1; i<number2; i++)
        {
            if (number2%i == 0)
            {
                number2Total += i;
            }
        }

        if ((number1 == number2Total) && (number2 == number1Total))
        {
            System.out.println("Friend numbers appeared.");
        }
        else
        {
            System.out.println("Sorry bro not this time");
        }
    }
}