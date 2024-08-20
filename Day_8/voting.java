import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        voting();
    }

    static void voting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int a = sc.nextInt();

        if(a>18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }
    }
    
}
