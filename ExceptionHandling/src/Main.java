public class Main {
    public static void main(String[] args) {

        //No errors till compile

        try {
            int[] numbers = new int[]{1,2,3,4};

            System.out.println(numbers[4]);
        }catch (Exception exception)
        {
            System.out.println("Seems like we got a problem");
        }
        finally {
            System.out.println("I work. Always...");
        }
    }
}