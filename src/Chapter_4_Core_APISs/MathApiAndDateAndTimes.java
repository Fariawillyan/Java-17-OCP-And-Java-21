package Chapter_4_Core_APISs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MathApiAndDateAndTimes {

    //any example of Math Apis
    int first = Math.max(3, 7); // 7
    int second = Math.min(7, -9); // -9

    long low = Math.round(123.34); // 123
    long high = Math.round( 123.50);// 124
    int fromFloat = Math.round(123.45f); //123

    double squared = Math.pow(5,2); // 25.0 exponents
    double num = Math.random();// randon number

    //----------------------------------------------------------------------------

    // Localdate, LocalDateTime and ZonedDateTime
    //Exist many ways... any example...

    //(.of), (.plus), (.minus), (duration), (period),(toInstante), (truncatedTo)... and other "need access documentation"

    public static void main(String[] args) {

        var zone = ZoneId.of("America/Sao_Paulo");
        var now = Instant.now(); // class represent a specific moment in time in the GMT time zone.
        var dateTime = LocalDateTime.now();
        System.out.println(now);
        System.out.println(dateTime);

    }
}