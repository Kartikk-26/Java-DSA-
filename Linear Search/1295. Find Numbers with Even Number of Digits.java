public class 1295. Find Numbers with Even Number of Digits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Helper Fucntion to check the number is even or not 
    boolean even(int num){
        int numberofDigit = digit(num);

        return numberofDigit % 2 == 0;
    }

    //Helper Function to count the number of digit which will check the even or odd 
    int digit(int num){
        if(num<0){
            num = -num; // Convert to positive for digit counting
        }

        if(num == 0){
            return -1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
