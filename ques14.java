/*Find the median of two sorted arrays using binary search. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ques14 {
    
    public static double findMedianSortedArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Ensure A is the smaller array
        if (A.size() > B.size()) {
            ArrayList<Integer> temp = A;
            A = B;
            B = temp;
        }

        int n = A.size(), m = B.size();
        int low = 0, high = n;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (n + m + 1) / 2 - i;

            int A_left = (i == 0) ? Integer.MIN_VALUE : A.get(i - 1);
            int A_right = (i == n) ? Integer.MAX_VALUE : A.get(i);
            int B_left = (j == 0) ? Integer.MIN_VALUE : B.get(j - 1);
            int B_right = (j == m) ? Integer.MAX_VALUE : B.get(j);

            if (A_left <= B_right && B_left <= A_right) {
                if ((n + m) % 2 == 0)
                    return (Math.max(A_left, B_left) + Math.min(A_right, B_right)) / 2.0;
                else
                    return Math.max(A_left, B_left);
            } else if (A_left > B_right) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        return -1.0; // Should never reach here
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 3));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(2));

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}