import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int ok = getOtp();

        System.out.println(ok);
    }

    static int getOtp() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
}
