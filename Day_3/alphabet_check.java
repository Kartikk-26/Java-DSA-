import java.util.Scanner;

public class alphabet_check {
    public static void main ( String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string : ");
        String input = sc.next().trim();

        for(int i=0; i<=input.length(); i++){
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) 
            {
                System.out.println(ch + " is an uppercase letter.");
            } 
            else if (Character.isLowerCase(ch)) 
            {
                System.out.println(ch + " is a lowercase letter.");
            } 
            else 
            {
                System.out.println(ch + " is not an alphabetic character.");
            }
        }
        sc.close();

    }
    
}
