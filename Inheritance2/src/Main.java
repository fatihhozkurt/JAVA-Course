//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.hesaplaUI(new TarımKrediManager());
        krediUI.hesaplaUI(new ÖğretmenKrediManager());
        krediUI.hesaplaUI(new AskerKrediManager());
    }
}