import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("----1. Displaying the current date and time----");
        DateTimePrinter.printCurrentDateTime();

        System.out.println("-----2. Adding and subtracting time-----");
        LocalDateTime initialDate = LocalDateTime.of(2023,10, 25, 14, 30);
        LocalDateTime futureDate = DateTimeCalculator.calculateFutureDateTime(initialDate,3,5);
        System.out.println("Initial date: " + initialDate);
        System.out.println("Result after adding 3 days and 5 hours: " + futureDate);

        System.out.println("-----3. Checking the weekend-----");
        LocalDateTime saturdayDate = LocalDateTime.of(2023, 10, 28, 10, 0);
        LocalDateTime mondayDate = LocalDateTime.of(2023, 10, 30, 10,0);
        System.out.println("Is 10/28/2023 (Saturday) a day off? " + WeekendChecker.isWeekend(saturdayDate));
        System.out.println("Is 10/30/2023 (Monday) a day off?" + WeekendChecker.isWeekend(mondayDate));

        System.out.println("----4. Date and time formatting----");
        LocalDateTime targetDate = LocalDateTime.of(2023,10,25,14,30);
        String formattedString = DateTimeFormatterUtil.formatDateTime(targetDate, "dd-MM-yyyy HH:mm");
        System.out.println("Formatted date: " + formattedString);

        System.out.println("----5. Difference between dates and time----");
        LocalDateTime start = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime end = LocalDateTime.of(2023, 10, 28, 16, 45);
        String differenceResult = DateDifferenceCalculator.calculateDifference(start, end);
        System.out.println(differenceResult);


    }
}
