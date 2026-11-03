import java.time.LocalDateTime;

public class DateTimeCalculator {

    public static LocalDateTime calculateFutureDateTime (LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }
}
