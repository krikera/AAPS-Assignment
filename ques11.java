/*Find two numbers in a sorted array that add up to a target. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques11 {
    
    public static class Pair {
        public int first;
        public int second;
        
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public static Pair findTwoSum(ArrayList<Integer> arr, int target) {
        int left = 0, right = arr.size() - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                return new Pair(arr.get(left), arr.get(right));
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new Pair(-1, -1); // Not found
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 10));
        int target = 10;
        Pair result = findTwoSum(nums, target);

        if (result.first != -1)
            System.out.println("Pair found: " + result.first + " + " + result.second + " = " + target);
        else
            System.out.println("No pair found.");
    }
}