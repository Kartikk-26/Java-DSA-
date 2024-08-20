import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        numbers();
    }

    static void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else if (a%2==1){
            System.out.println("Odd");
        }
        else if (a==0){
            System.out.println("Zero");
        }
    }
    
}
