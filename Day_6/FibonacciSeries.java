import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in the Fibonacci sequence:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Numbers till " + n + " Is:");
        
        // Print the first term
        System.out.print(a);

        // Print the second term if n is greater than 1
        if (n > 1) {
            System.out.print(" " + b);
        }

        // Print the remaining terms
        for (int count = 3; count <= n; count++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(" " + b);
        }

        System.out.println(); // New line at the end
    }
}