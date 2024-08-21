//This code is anout method overloading in which two funcation of same name but different parameter has been passed

import java.util.Scanner;

public class methodOverload {
    public static void main(String[] args) {
        fun(67);
        fun("Kartik Jain");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
