import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        System.out.println("Enter the Name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("\nYou entered :\n" + name);
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
