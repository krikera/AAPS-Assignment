/*Check if an array can be split into two parts such that the sum of the prefix equals the 
sum of the suffix. Write its algorithm, program. Find its time and space complexities. 
Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques4 {
    
    public static boolean canBeSplitWithEqualSum(ArrayList<Integer> arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.size() - 1; ++i) { // Exclude last element from left
            leftSum += arr.get(i);
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 3));

        if (canBeSplitWithEqualSum(arr))
            System.out.println("Array can be split into two parts with equal sum.");
        else
            System.out.println("Array cannot be split into two parts with equal sum.");
    }
}