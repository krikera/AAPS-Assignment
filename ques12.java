/* Rearrange numbers into the lexicographically next greater permutation. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ques12 {
    
    public static void nextPermutation(ArrayList<Integer> nums) {
        int n = nums.size();
        int i = n - 2;

        // Step 1: Find first decreasing element from the end
        while (i >= 0 && nums.get(i) >= nums.get(i + 1)) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the number just larger than nums[i] from the right
            int j = n - 1;
            while (j >= 0 && nums.get(j) <= nums.get(i)) {
                j--;
            }
            // Swap nums[i] and nums[j]
            int temp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, temp);
        }

        // Step 3: Reverse the elements from i+1 to end
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        nextPermutation(nums);

        System.out.print("Next permutation: ");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}