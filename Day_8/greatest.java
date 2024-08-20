//TO CHECK WHETHER THE NUMBER IS GREATEST ANS SMALLEST USING THE FUNCTION

import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int max = maximum(a, b, c);  // Call the maximum method
        int min = minimum(a, b, c);  // Call the minimum method

        System.out.println("\nGreater number is: " + max);
        System.out.println("\nSmallest number is: " + min);
    }

    static int maximum(int a , int b , int c){
        int max =a ;
        if(b>max){
            max =b;
        }

        else if (c > max){
            max = c;
        }

        return max;

        //System.out.println("\nGreater number is : " + max);
    }

    static int minimum(int a , int b , int c){
        int min =a ;
        if(b<min){
            min =b;
        }

        else if (c < min){
            min = c;
        }

        return min;

        // System.out.println("\nSmallest number is : " + min);

    }
    
}
