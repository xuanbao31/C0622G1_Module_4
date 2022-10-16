import java.util.Date;
import java.util.TimeZone;

public class demo {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        TimeZone local = TimeZone.getDefault();
        System.out.println(local);
//        TimeZone locale =TimeZone.getTimeZone()

    }
}
