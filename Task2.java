import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        //Программа хранит две даты с Днями рождения ваших друзей. Даты заранее заданы в массиве (без сканера).
        //Выведите, сколько дней осталось до Дней Рождения ваших друзей с текущей даты

        //Вариант с Date
        Date[] hbs = {new Date(1685722216000L), new Date(1678291816000L)};
        Date now = new Date();

        for (Date date: hbs) {
            if (now.after(date)) {
                long difference1 = now.getTime() - date.getTime();
                System.out.println("Дней до Дня Рождения осталось " + (365 - difference1/1000/60/60/24));
            } else if (now.before(date)) {
                long difference2 = date.getTime() - now.getTime();
                System.out.println("Дней до Дня Рождения осталось " + difference2/1000/60/60/24);
            } else {
                System.out.println("Дней до Дня Рождения осталось " + 0);
            }

        }

        //Вариант с Instant и Map, ответ немного другой из-за разных подходов к округлению
        Map<String, Instant> hbsInstant = new HashMap<>();
        hbsInstant.put("День рождения Васи", Instant.ofEpochMilli(1685722216000L));
        hbsInstant.put("День рождения Лены", Instant.ofEpochMilli(1646758281000L));

        Instant nowInstant = Instant.now();
        long difference = 0;

        var keys = hbsInstant.keySet();
        for (Instant instant: hbsInstant.values()) {
            if (nowInstant.isAfter(instant)) {
                difference = 365 - (nowInstant.getEpochSecond() - instant.getEpochSecond())/60/60/24;
            } else if (nowInstant.isBefore(instant)) {
                difference = (instant.getEpochSecond() - nowInstant.getEpochSecond())/60/60/24;
            }

            final long daysCount = difference;
            keys.forEach(key -> {
                if(hbsInstant.get(key) == instant) {
                    System.out.println("До " + key + " осталось " + daysCount + " дней(дня)");
                }
            });
        }

    }
}
