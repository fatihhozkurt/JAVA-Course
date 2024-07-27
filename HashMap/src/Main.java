import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, String> vocabulary = new HashMap<String,String>();

        vocabulary.put("Thread", "İş Parçacığı");
        vocabulary.put("Core", "Çekirdek");
        vocabulary.put("Process", "İşlem");

        for (String vocabularyIndex : vocabulary.keySet())
        {
            System.out.println("Key: " + vocabularyIndex + "\n" + "Value: " + vocabulary.get(vocabularyIndex) + "\n");
        }

    }
}