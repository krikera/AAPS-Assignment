/* Question : Explain the sliding window technique and its use in string problems.

   Ans:- The sliding window technique is a powerful algorithmic strategy used to efficiently solve problems involving contiguous sequences in arrays or strings.
         Instead of using nested loops to check all possible subarrays/substrings (which results in O(n²) time), you use a "window" that moves through the data 
         in linear time.
         
         How It Works (General Steps)

         Initialize two pointers (start, end) to define the window.
         Expand the window by moving end pointer.
         When a condition is met or violated:
         Process/Update the result.
         Shrink or shift the window by moving start.
         Repeat until the end of the array/string is reached.
         
        Applications 
        1. Longest Substring Without Repeating Characters
            Variable window: Expand until a character repeats, then slide start past the last index of the repeating character.

        2. Anagram Detection (e.g., find all anagrams of p in s)
            Fixed-size window: Use a frequency map of size p.length() and slide the window across s.

        3. Minimum Window Substring (Smallest substring containing all characters of t)
            Variable window: Expand until all chars in t are included, then shrink to find the minimum.

        4. Longest Substring with At Most K Distinct Characters
            Variable window: Track character counts in a map; shrink when distinct characters exceed K.
*/

public class ques7 {
    public static void main(String[] args) {
        // This file contains explanation about sliding window technique
        System.out.println("This file explains the sliding window technique and its applications.");
    }
}