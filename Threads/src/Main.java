public class Main {
    public static void main(String[] args) {

        ChronometerThread thread = new ChronometerThread("Kronometre");
        ChronometerThread thread2 = new ChronometerThread("Kronometre 2");
        ChronometerThread thread3 = new ChronometerThread("Kronometre 3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}