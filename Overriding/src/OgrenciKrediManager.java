public class OgrenciKrediManager extends BaseKrediManager {

    @Override
    public double hesapla(double miktar) {
        return miktar * 1.10;
    }
}