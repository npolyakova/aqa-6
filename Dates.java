import javax.xml.stream.events.DTD;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        //Date
        Date d1 = new Date();
        d1.setYear(134);
        d1.setMonth(Calendar.MARCH);
        d1.setDate(2);

        System.out.println(d1.getTime());

        System.out.println(d1);
        System.out.println(d1.getYear());
        System.out.println(d1.getMonth());
        System.out.println(d1.getDate());

        Date d2 = new Date(1675356011000L);
        System.out.println(d2);
        System.out.println(d2.equals(d1));
        System.out.println(d1.after(d2));

        //Instant
        Instant now = Instant.now();
        Instant future = Instant.ofEpochMilli(1680453611000L);

        future.equals(now);
        future.plusMillis(1234);
        future.plus(1, ChronoUnit.DAYS);
        //now.isBefore();

        //LocalDate
        LocalDate ld = LocalDate.ofYearDay(2023, 76);
        System.out.println(ld);
    }
}
