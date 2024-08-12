import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int n = sc.nextInt();

        double sum = 0;
        System.out.println("Enter the Numbers: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("" + (i + 1) + ": ");
            double num = sc.nextDouble();   //To add the numbers 
            sum = sum + num;
    }
    
    System.out.println("The sum is: " + sum);

    }
    
}
