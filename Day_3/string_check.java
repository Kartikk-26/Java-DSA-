import java.util.Scanner;

public class string_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().trim();

        if(input.equals(input.toUpperCase())){
            System.out.println("The entire string is in UPPERCASE");
        }
        else if(input.equals(input.toLowerCase())){
            System.out.println("The entire string is in LOWERCASE");
        }
        else{
            System.out.println("The string is a mix of UPPERCASE and LOWERCASE");
        }
        sc.close();
    }
}