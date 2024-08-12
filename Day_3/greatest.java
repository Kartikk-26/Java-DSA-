import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        b = sc.nextInt();

        if(a>b){
            System.out.println("The greatest number from " +a + " and " +b +" is : " +a);
        }
        else if(b>a){
            System.out.println("The greatest number from " +a + "and" +b +"is : " +b);
       }
       else{
        System.out.println("Both numbers are equal");
       }
    }
    
}
