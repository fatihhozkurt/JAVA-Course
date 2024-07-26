//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarimKrediManager(), new OgrenciKrediManager(), new OgretmenKrediManager()};

        for(BaseKrediManager baseKrediManager: baseKrediManagers)
        {
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}