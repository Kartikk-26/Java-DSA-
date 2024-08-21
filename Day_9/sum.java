import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int a = sc.nextInt();
        int result = sum(a);
        System.out.println("Sum of first " + a + " natural numbers is " + result);
    }

    static int sum(int a){
        return a * (a+1) / 2;
    }
}
