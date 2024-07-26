//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};

        CalculatorManager calculator = new CalculatorManager();
        
        System.out.println("Result of addition: " + calculator.sum(numbers));
        System.out.println("Result of substraction: " + calculator.sub(numbers));
        System.out.println("Result of division: " + calculator.div(numbers));
        System.out.println("Result of multiplication: " + calculator.mul(numbers));
    }
}