//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CalculatorManager calculator = new CalculatorManager();
        
        System.out.println("Result of addition: " + calculator.addition(1, 2, 3));
        System.out.println("Result of substraction: " + calculator.subtraction(1, 2, 3));
        System.out.println("Result of division: " + calculator.division(1, 2, 3));
        System.out.println("Result of multiplication: " + calculator.multiplication(1, 2, 3));
    }
}