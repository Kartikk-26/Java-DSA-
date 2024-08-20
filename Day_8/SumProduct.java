import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int total1 = sum(a , b);
        System.out.println("Sum is : " + total1);

        int total2 = product(a,b);
        System.out.println("Product is : " + total2);
    }

    static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }

    static int product(int a , int b){
        int product = a*b;
        return product;
    }
    
}
