import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalsum =0;
        int number;

        while (true) {
            System.out.println("Enter the number ( Negative number to stop) : ");
            number = sc.nextInt();

            if(number <0 ){
                break;
            }

            totalsum += number;
            
        }

        System.out.println("Sum is : " + totalsum);
        sc.close();
    }
    
}
