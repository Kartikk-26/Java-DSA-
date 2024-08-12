import java.util.Scanner;

public class greatest_number {
    public static void main ( String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max =a ;
        if(b>max){
            max =b;
        }

        else if (c > max){
            max = c;
        }

        System.out.println("\nGreater number is : " + max);
    }
    
}
