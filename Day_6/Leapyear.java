import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a year");
        int y = sc.nextInt();

        if(y % 4 == 0 && y % 100!= 0 || y % 400 == 0){
            System.out.println(y + " is a Leap year");
        }
        else{
            System.out.println(y + " is not a Leap year");
        }
    }
}
