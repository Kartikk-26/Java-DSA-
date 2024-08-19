import java.util.Scanner;

public class arguementString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        String personalString = greet(name);
        System.out.println(personalString);
    }

    static String greet(String name){
        String message = "Hello ! " + name;
        return message;
    }
    
}
