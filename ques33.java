/*Explain the sliding window technique and its applications in array problems.

Ans:- It involves using a window (subset) that moves (or "slides") over the data structure (like an array or string) to avoid redundant computations and improve performance.

Instead of recomputing values from scratch for every subarray, we adjust the window to include new elements and exclude old ones.

Two Types of Sliding Window:

1>Fixed-size window
Use when subarray size is constant (e.g., size k).
Example: Maximum sum of subarrays of size k.

2>Variable-size window
Use when subarray size changes dynamically based on conditions.
Example: Longest substring with unique characters.

Applications in Array Problems:

Problem Example	                                       Sliding Window Use
Maximum/minimum sum of subarrays of size k	           Fixed-size window
Longest substring without repeating characters	       Variable-size window with hash map
Maximum element in every window of size k	           Sliding window with deque
Number of subarrays with sum less than k	           Variable-size with 2 pointers
Minimum size subarray sum ≥ target	                   Shrink window based on condition*/

public class ques33 {
    public static void main(String[] args) {
        // This file explains the sliding window technique and its applications
        System.out.println("This file explains the sliding window technique and its applications in array problems.");
    }
}