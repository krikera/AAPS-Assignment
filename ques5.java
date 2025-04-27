/*Find the maximum sum of any subarray of size K in a given array. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ques5 {
    
    public static int maxSumSubarrayOfSizeK(ArrayList<Integer> arr, int K) {
        int n = arr.size();
        if (K > n) return -1;

        // Compute the sum of the first window
        int windowSum = 0;
        for (int i = 0; i < K; ++i) {
            windowSum += arr.get(i);
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = K; i < n; ++i) {
            windowSum += arr.get(i) - arr.get(i - K);
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        int K = 3;

        int result = maxSumSubarrayOfSizeK(arr, K);
        System.out.println("Maximum sum of subarray of size " + K + " is: " + result);
    }
}