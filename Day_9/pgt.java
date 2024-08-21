import java.util.Scanner;

public class pgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of Base , Perpendicular , Hypotenous");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        pgt(a, b, c);
    }

    static void pgt(int a, int b, int c){
        if (a*a + b*b == c*c) {
            System.out.println("This is a right angled triangle");
        }
        else {
            System.out.println("This is not a right angled triangle");
        }
    }
}
