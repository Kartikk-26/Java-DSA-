import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp =1;
        int fact = 1;

        while(temp<=n){
            fact =fact*temp;
            temp++;
        }

        System.out.println("Factorial of " + n +" is : " + fact);

    
    }
    
}
