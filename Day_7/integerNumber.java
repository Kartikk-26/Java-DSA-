import java.util.Scanner;

public class integerNumber {
    public static void main(String[] args) {
        int ans = sum2();                   // ans is reference variable in which the total valus of sum is stored 
        System.out.println(ans);            // the value of ans is printed ( sum )
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        return sum;
    }
}

