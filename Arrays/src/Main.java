//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] students = new String[4];
        students[0] = "Fatih";
        students[1] = "Seda";
        students[2] = "Mislina";
        students[3] = "Barış";

        for(int i = 0; i<students.length; i++)
        {
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------------");

        for(String studentIndex: students)
        {
            System.out.println(studentIndex);
        }
    }
}