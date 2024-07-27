import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Dosya okuma paketi
        BufferedReader bufferedReader = null;

        //Try-catch zorunlu metodu
        try {

            //fileReader ile oku
            bufferedReader = new BufferedReader(new FileReader("src/text"));

        } catch (FileNotFoundException exception) {

            //Yoksa throw new Runtime Exception
            throw new RuntimeException(exception);
        }
        finally {
            //Ne olursa olsun bufferreaderı kapat
            try {

                bufferedReader.close();

            } catch (IOException exception) {
                //dosya bulunamadıysa kapatamaz zaten diye tadım testi
                throw new RuntimeException(exception);

            }
        }
    }
}