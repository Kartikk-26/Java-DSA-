import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        double sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("" + (i + 1) + ": ");
            double num = sc.nextDouble();   //To add the numbers 
            sum = sum + num;
    }

    double average = sum/n;
    System.out.println("The sum is: " + sum);
    System.out.println("The average is: " + average);
    sc.close();

    }
}
