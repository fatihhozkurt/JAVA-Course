import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String announce = "Bugün hava çok güzel.";
        char[] transfered = new char[5];

        //Tüm metni lowercase yapar
        System.out.println(announce.toLowerCase());
        //Tüm metni uppercase yapar
        System.out.println(announce.toUpperCase());
        //Tüm metnin uzunluğunu verir
        System.out.println(announce.length());
        //Metni, yeni bir metin ile birleştirir
        System.out.println(announce.concat(" Belki de değildir?"));
        //Indexteki char değerinin ne olduğunu verir
        System.out.println(announce.charAt(3));
        //Metnin, girilen char değeri ile başlayıp başlamadığını kontrol eder (boolean)
        System.out.println(announce.startsWith("S"));
        //Metnin, girilen char değeri ile bitip bitmediğini kontrol eder (boolean)
        System.out.println(announce.endsWith(" "));
        //Girilen String ya da char ifadesinin ilk görüldüğü yerin indexini verir
        System.out.println(announce.indexOf("Seda"));
        //Girilen String ya da char ifadesinin ilk görüldüğü yeri sondan kontrol ederek indexini verir
        System.out.println(announce.lastIndexOf("o"));

        //Bir char dizisini başka bir char dizisine aktarır
        announce.getChars(0,5,transfered,0);
        System.out.println(transfered);

        System.out.println("------------Part 2--------------------");

        //Bir charı başka bir char ile değiştirir. (Unicode'dan ASCII ye çevirirken ya da başlığı URL e çevirirken başka bir değişkene atarsan oldukça kullanışlı)
        System.out.println(announce.replace(' ', '-'));
        System.out.println(announce.replace('ı','i'));
        //2.indexten sonrasını kesip alıyor
        System.out.println(announce.substring(2));
        //2.den 6.indexe kadar metni keser
        System.out.println(announce.substring(2,6));

        System.out.println("\n");

        //Metni belirlenen parametrelere göre ayırır
        for (String words: announce.split(" "))
        {
            System.out.println(words);
        }

        //Textin başındaki ve sonundaki boşlukları trimler.
        System.out.println(announce.trim());
    }
}