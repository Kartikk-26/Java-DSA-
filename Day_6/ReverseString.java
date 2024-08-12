import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().trim();    //Orignal String

        String reversedString="";

        for(int i=str.length()-1; i>=0; i--){
            reversedString = reversedString + str.charAt(i);
        }

        System.out.println("Orignal String is : " + str);
        System.out.println("Reversed String is : " + reversedString);

        sc.close();
    }
}