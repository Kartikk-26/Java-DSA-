import java.util.Scanner;

public class sumMethod {
    public static void main(String[] args) {
        CalculateSum();
    }

    public static void CalculateSum(){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        int total = a*b;
        System.out.println("Sum of the Numbers is : "+sum);
        System.out.println("Multiply of the Numbers is : "+total);
    }

}