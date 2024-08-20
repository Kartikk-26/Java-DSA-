import java.util.Scanner;

class primeNumber {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether prime or not : ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is Prime Number");
        }
        else {
            System.out.println(num + " is not Prime Number");
        }
    }
}