import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the heading
        System.out.println("********** CGPA Calculator **********");
        System.out.println("Note: Maximum marks in each subject is 100.");

        // Taking input for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to store marks of each subject
        int[] marks = new int[numSubjects];

        // Taking input for marks in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculating total marks obtained
        int totalMarksObtained = 0;
        for (int mark : marks) {
            totalMarksObtained += mark;
        }

        // Calculating percentage
        double percentage = (double) totalMarksObtained / (numSubjects * 100) * 100;

        // Calculating CGPA (assuming percentage to CGPA conversion: CGPA = Percentage / 9.5)
        double cgpa = percentage / 9.5;

        // Displaying the result
        System.out.println("\nTotal Marks Obtained: " + totalMarksObtained + " out of " + (numSubjects * 100));
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
}
