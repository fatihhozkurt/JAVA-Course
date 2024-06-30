//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int grade = 'A';
        String message = "Your grade is ";

        switch (grade)
        {
            case 'A':
                System.out.println(message + 'A');
                break;
            case 'B':
                System.out.println(message + 'B');
                break;
            case 'C':
            case 'D':
                System.out.println(message + 'D');
                break;
            case 'F':
                System.out.println("message" + 'F');
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}