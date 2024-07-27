//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {

            int[] numbers = new int[]{1, 2, 3, 4, 5};
            System.out.println(numbers[7]);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);

        } catch (StringIndexOutOfBoundsException exception) {

            System.out.println(exception);
            //Başka bir hata türünü yakalayıp ona göre işlem yapmak için

        }
        catch (Exception exception)
        {
            System.out.println("Var valla bir şeyler olmuş belli ki");
            //Her şeye kadir olan o exception
        }
        finally {

            System.out.println("I work. Always...");

        }

    }
}