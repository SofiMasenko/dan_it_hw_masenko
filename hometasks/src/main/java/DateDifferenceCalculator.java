import java.time.Duration;
import java.time.LocalDateTime;

public class DateDifferenceCalculator {


    public static String calculateDifference (LocalDateTime start, LocalDateTime end){
        Duration duration = Duration.between(start, end);

        long totalMinutes = duration.toMinutes();

        long days = totalMinutes / (24*60);
        long hours = (totalMinutes %(24*60)) /60;
        long minutes = totalMinutes % 60;

        return "Difference: " + days + "days, " + hours + " hours, " + minutes + " minutes.";
    }
}
