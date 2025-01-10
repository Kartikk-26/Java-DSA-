import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Maximum Element of Array is : "+ max(arr));
        System.out.println("Minimum Element of Array is : "+ min(arr));
    }

    static int max (int[]arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int min (int[]arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }



}