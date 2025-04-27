/* Question 1. Explain the concept of a prefix sum array and its applications.//

//Ans :- A prefix sum array is an array where each element at index i stores the sum of all elements from the beginning of the array up to index i.
         prefix[0] = arr[0]
         prefix[i] = prefix[i-1] + arr[i] for i = 1 to n-1

         Applications of prefix Sum 
         1>Range Sum Queries in O(1) Time
            Find the sum of elements from index l to r

         2>Subarray Sum Problems
            Helps in finding subarrays that meet a certain sum efficiently.

         3>Histogram or Frequency Count (Prefix Count)
            Count occurrences of values or conditions in a given range.

         4>Image Processing
            Used in 2D prefix sums for efficient area sum queries in matrices (e.g., summed-area table).

         5>Difference Array Problems
            Prefix sums can be used in reverse to recover the original array after a series of range update operations.

         6>Cumulative Distribution Function in Statistics
            Calculates cumulative probability efficiently.
         */

public class ques1 {
    public static void main(String[] args) {
        // This file only contains the explanation of prefix sum concept
        System.out.println("This file explains the concept of prefix sum arrays.");
    }
}