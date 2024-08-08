import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        //System.out.println(number);
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+ number*i);
        }
        System.out.print("This is the table of "+number);
    }
}
