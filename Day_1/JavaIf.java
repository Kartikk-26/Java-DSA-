import java.util.Scanner;

public class JavaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();

        if (name.equals("Kartik") && roll == 21) {
            System.out.println("Correct Details of Kartik");
        } else {
            System.out.println("Incorrect Details");
        }

        scanner.close();
    }
}
