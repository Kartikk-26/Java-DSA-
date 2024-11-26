import java.util.Scanner;

public class rollNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] rollNumbers = new int[5];

        System.out.println("Enter 5 roll numbers:");

        for(int i=0; i<rollNumbers.length; i++){
            System.out.print("Roll number " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("\nThe entered roll numbers are:");
        for(int rollNumber : rollNumbers){
            System.out.println(rollNumber);
        }
        
    }
}