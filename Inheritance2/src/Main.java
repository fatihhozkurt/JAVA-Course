//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();

        krediUI.krediHesapla(new ÖğretmenKrediManager());
        krediUI.krediHesapla(new TarımKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
    }
}