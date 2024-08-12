import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        int ans =0; //Count starts with 0 

        while(a>0){
            int rem = a%10; //Remainder of a divided by 10
            a=a/10; //To check the previous number
            ans = ans*10+rem;
        }

        System.out.println("Reversed number is : " + ans);
    }
    
}
 