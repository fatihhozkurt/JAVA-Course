import Math.SSDM;
import Math.RandomNumber;
//import Math.*;

public class Main {
    public static void main(String[] args) {

        float n1 = 15.3F, n2 = 25.5F;

        SSDM ssdm = new SSDM();
        RandomNumber randomNumber = new RandomNumber();

        System.out.println(ssdm.sum(n1,n2));

        System.out.println(randomNumber.randomize());

    }
}