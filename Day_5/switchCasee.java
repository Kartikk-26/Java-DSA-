import java.util.Scanner;

public class switchCasee{
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = sc.nextInt();

        switch(day){
            case 1,2,3,4,5,6 -> System.out.println("Weekday");
            case 7 -> System.out.println("Weekend");
        }
    }

}