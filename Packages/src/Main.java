import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız: ");

        String name = scanner.nextLine();

        System.out.println("Hoş geldin " + name);

    }
}