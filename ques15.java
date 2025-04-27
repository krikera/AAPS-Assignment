/* Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its 
time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques15 {
    
    // Helper to count elements <= mid in matrix
    public static int countLessEqual(int[][] matrix, int mid, int[] smallerLarger) {
        int count = 0, n = matrix.length;
        int row = n - 1, col = 0;
        int smaller = Integer.MIN_VALUE;
        int larger = Integer.MAX_VALUE;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                smaller = Math.max(smaller, matrix[row][col]);
                count += row + 1;
                col++;
            } else {
                larger = Math.min(larger, matrix[row][col]);
                row--;
            }
        }

        smallerLarger[0] = smaller;
        smallerLarger[1] = larger;
        return count;
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int[] smallerLarger = {matrix[0][0], matrix[n - 1][n - 1]};
            int count = countLessEqual(matrix, mid, smallerLarger);

            if (count < k)
                low = smallerLarger[1]; // larger
            else
                high = smallerLarger[0]; // smaller
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        System.out.println("K-th smallest element is: " + kthSmallest(matrix, k));
    }
}