import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their birth date
        System.out.println("Enter your birth year (YYYY): ");
        int year = scanner.nextInt();

        System.out.println("Enter your birth month (MM): ");
        int month = scanner.nextInt();

        System.out.println("Enter your birth day (DD): ");
        int day = scanner.nextInt();

        // Create birth date and current date objects
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between birth date and current date
        Period age = Period.between(birthDate, currentDate);

        // Display the calculated age
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");

        scanner.close();
    }
}