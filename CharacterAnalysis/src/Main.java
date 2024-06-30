//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char character = 'e';

        switch (character)
        {
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli ünlü");
                break;
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli ünlü");
                break;
            default:
                System.out.println("İnce ya da kalın ses değil");
        }
    }
}