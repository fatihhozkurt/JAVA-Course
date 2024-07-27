import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("src/numbers"));

            int total = 0;

            //Okuduğumuz lineları atamak için
            String line = null;

            //readLine ile satırları okuyup değerini line'a atıyoruz ve boş mu diye kontrol ediyoruz.
            while ( (line = bufferedReader.readLine()) != null )
            {
                //valueOf ile Stringten Integera çeviriyoruz
                total += Integer.valueOf(line);
            }
            System.out.println(total);
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }

    }
}