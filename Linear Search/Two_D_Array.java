public class Two_D_Array {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 45, 85, 74},
            {22, 56, 48, 75},
            {44, 74, 85, 47},
            {41, 48, 45, 92}
        };
        int target = 48;
        int[] ans = search(arr, target); // Correct type: int[]

        if (ans != null) {
            System.out.println("Target found at row " + ans[0] + " and column " + ans[1]);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column}; // Return position as an array.
                }
            }
        }
        return null; // Return null if the target is not found.
    }
}
