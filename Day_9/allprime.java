import java.util.Scanner;

public class allprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers in which you want Prime Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Prime numbers between " + a + " and " + b + " are:");
        prime(a, b);
    }

    static void prime(int a, int b) {
        for (int i = Math.max(a, 2); i <= b; i++) {  // Start from max(a, 2) as primes are >= 2
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;  // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {  // Check divisibility up to √n
            if (n % i == 0) return false;
        }
        return true;
    }
}
