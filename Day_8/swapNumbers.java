//This is code of swap two number using a function /method 

import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping"+ " a = " + a +" b = "+ b);
        swap(a,b);
    }

    public static void swap(int a,int b){
        int temp = a;
        a =b;
        b = temp;
        System.out.println("After swapping"+ " a = " + a +" b = "+ b);
    }

}
