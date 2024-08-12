import java.util.Scanner;

public class switchcase1 {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day of the week :");
        String day = sc.nextLine().trim();

        switch (day.toLowerCase()) {   //Automatically converting to lowercase so that my case can run
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Today is a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Today is a weekend");
                break;
            default:
                System.out.println("Invalid day entered");
                break;
        }
        
        sc.close();
    }
}
