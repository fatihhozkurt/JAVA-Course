public class CalculatorManager {

    public int sum(int... numbers)
    {
        int result = 0;

        for (int numbersComponents : numbers)
        {
            result += numbersComponents;
        }

        return result;
    }

    public int sub(int... numbers)
    {
        int result = 0;

        for (int numbersComponents : numbers)
        {
            result -= numbersComponents;
        }

        return result;
    }

    public float div(int... numbers)
    {
        float result = 0.0F;

        for (int numbersComponents : numbers)
        {
            result /= numbersComponents;
        }

        return result;
    }

    public int mul(int... numbers)
    {
        int result = 1;

        for (int numbersComponents : numbers)
        {
            result *= numbersComponents;
        }

        return result;
    }
}