package Day_11;
import java.util.Scanner;

public class main{
    //Main Function
    public static void main( String[] args){
        int [] nums = {22,10,8,17,15,18};
        int target = 8;
        int ans = linearSearch(nums,target);
        if (ans != -1) {
            System.out.println("Target element found at index: " + ans);
        } else {
            System.out.println("Target element not found.");
        }
    }

    // Helper Function 
    static int linearSearch(int[] arr , int target){
            if(arr.length==0){
                return -1;
            }

            for(int i=0; i<arr.length; i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
}