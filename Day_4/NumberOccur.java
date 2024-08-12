import java.util.Scanner;

public class NumberOccur {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number which you haver to count : ");
        int b = sc.nextInt();

        int count =0; //Count starts with 0 

        while(a>0){
            int rem = a%10; //Remainder of a divided by 10
            if(rem == b){
                count++;
            }
            a=a/10; //To check the previous number
        }

        System.out.println("" + b + " Occured : " + count + " Times");
    }
    
}
