public class OgretmenKrediManager extends BaseKrediManager{

    @Override
    public double hesapla(double miktar) {
        return miktar * 1.20;
    }

}