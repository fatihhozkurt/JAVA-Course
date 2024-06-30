public class CalculatorManager {

    public int addition(int... numbers) {
        int total = 0;

        for (int numberIndex : numbers) {
            total += numberIndex;
        }

        return total;
    }

    public int subtraction(int... numbers) {
        int total = 0;

        for (int numberIndex : numbers) {
            total -= numberIndex;
        }

        return total;
    }

    public double division(int... numbers) {
        double total = 1.0;

        for (int numberIndex : numbers) {
            total /= numberIndex;
        }

        return total;
    }

    public double multiplication(int... numbers) {
        double total = 1.0;

        for (int numberIndex : numbers) {
            total *= numberIndex;
        }

        return total;
    }

}
