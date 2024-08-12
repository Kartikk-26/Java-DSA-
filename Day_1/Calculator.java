import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take the operator as input
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char op = in.next().trim().charAt(0);

        // input two numbers
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = 0;
        boolean validOperation = true;

        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    validOperation = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    ans = num1 % num2;
                } else {
                    System.out.println("Cannot modulo by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation!!");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("The result is: " + ans);
        }
        
        in.close();
    }
}
