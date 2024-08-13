import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Birthday Calculator!");

        // Get today's date and time
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Month (1-12): ");
        int currentMonth = scanner.nextInt();
        System.out.print("Day: ");
        int currentDay = scanner.nextInt();
        System.out.print("Hour (0-23): ");
        int currentHour = scanner.nextInt();
        System.out.print("Minute (0-59): ");
        int currentMinute = scanner.nextInt();
        System.out.print("Second (0-59): ");
        int currentSecond = scanner.nextInt();

        LocalDateTime today = LocalDateTime.of(currentYear, currentMonth, currentDay, currentHour, currentMinute, currentSecond);

        // Get birthdate
        System.out.println("Enter your birthdate:");
        System.out.print("Month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Day: ");
        int birthDay = scanner.nextInt();

        LocalDateTime birthDateThisYear = LocalDateTime.of(currentYear, birthMonth, birthDay, 0, 0, 0);

        // Calculate days, hours, minutes, and seconds left until birthday
        if (birthDateThisYear.isBefore(today) || birthDateThisYear.isEqual(today)) {
            // If birthday has passed this year, calculate for the next year
            birthDateThisYear = birthDateThisYear.plusYears(1);
        }

        Duration duration = Duration.between(today, birthDateThisYear);
        long days = duration.toDays();
        duration = duration.minusDays(days);
        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        long seconds = duration.getSeconds();

        // Print the result
        System.out.println("The time remaining is");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
    }
}
