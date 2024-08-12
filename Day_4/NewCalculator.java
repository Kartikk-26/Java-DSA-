import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Take the operator as input
        System.out.println("Enter the operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        // Input two numbers
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = 0;

         // Perform the operation based on the operator

         if(operator == '+'){
            result = num1 + num2;
         }
         else if (operator == '-'){
            result = num1 - num2;
         }
         else if(operator =='*'){
            result = num1 * num2;
         }
         else if(operator =='/'){
            if(num2 !=0){
                result = num1/ num2;
            }
            else {
                System.out.println("Cannot divide by zero.");
                sc.close();
                return;
            }
         }
         else if(operator =='%'){
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                System.out.println("Cannot modulo by zero.");
                sc.close();
                return;
            }
         }
         else{
            System.out.println("Invalid operator.");
            sc.close();
            return;
         }

         // Output the result
        System.out.println("The result is: " + result);
        sc.close();
    }    
}
