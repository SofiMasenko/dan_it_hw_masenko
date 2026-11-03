import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class WeekendChecker {

    public static boolean isWeekend (LocalDateTime dateTime) {
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
