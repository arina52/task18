import java.time.*;
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 2);
        LocalTime time = LocalTime.of(13, 20, 0);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(zonedDateTime);

        date = date.plusDays(1);
        time = time.plusHours(1);
        time = time.plusMinutes(1);
        date = date.plusYears(1);

        ZonedDateTime newZonedDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(newZonedDateTime);
    }
}