//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Sakarya";
        cities[1][0] = "Ankara";
        cities[1][1] = "Sivas";
        cities[1][2] = "Konya";
        cities[2][0] = "Kars";
        cities[2][1] = "Ardahan";
        cities[2][2] = "Erzurum";

        for(int i = 0; i<cities.length; i++)
        {
            for (int j = 0; j<cities.length; j++)
            {
                System.out.println(cities[i][j]);
            }
        }
    }
}