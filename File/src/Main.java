import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        createFile();

        //getFileInfo();

        writeFile();

        readFile();
    }

    public static void createFile()
    {
        File file = new File("C:\\Users\\fatih\\OneDrive\\Masaüstü\\Java 1\\Basic\\File\\src\\text.txt");

        try {

            if (file.createNewFile())
            {
                System.out.println("Dosya oluşturuldu.");
            }
            else
            {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void getFileInfo()
    {
        File file = new File("C:\\Users\\fatih\\OneDrive\\Masaüstü\\Java 1\\Basic\\File\\src\\text.txt");

        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.exists());

    }

    public static void readFile()
    {
        String path = "C:\\Users\\fatih\\OneDrive\\Masaüstü\\Java 1\\Basic\\File\\src\\text.txt";
        File file = new File(path);

        Scanner reader = null;

        try
        {
            reader = new Scanner(file);
            String line = null;

            while (reader.hasNextLine())
            {
                line = reader.nextLine();
                System.out.println(line);
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        finally {
            reader.close();
        }
    }

    public static void writeFile()
    {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\fatih\\OneDrive\\Masaüstü\\Java 1\\Basic\\File\\src\\text.txt",true));

            writer.write("Selamlar");
            writer.newLine();
            writer.write("Napıyonuz la");
            writer.newLine();
        }
        catch (IOException exception)
        {
            throw new RuntimeException(exception);
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

