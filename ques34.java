/* Solve the problem of finding the subarray sum equal to K using hashing. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ques34 {
    
    public static int subarraySum(ArrayList<Integer> nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int currSum = 0, count = 0;

        for (int num : nums) {
            currSum += num;

            if (currSum == k) count++;

            if (prefixSumCount.containsKey(currSum - k))
                count += prefixSumCount.get(currSum - k);

            prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + " is: " + subarraySum(arr, k));
    }
}