/*Write a program to find the sum of elements in a given range [L, R] using a prefix sum 
array. Write its algorithm, program. Find its time and space complexities. Explain with 
suitable example*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques2 {
    
    // Function to create prefix sum array
    public static ArrayList<Integer> createPrefixSum(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> prefix = new ArrayList<>(n);
        
        prefix.add(arr.get(0));
        
        for (int i = 1; i < n; ++i) {
            prefix.add(prefix.get(i - 1) + arr.get(i));
        }
        
        return prefix;
    }
    
    // Function to find sum in range [L, R]
    public static int rangeSum(ArrayList<Integer> prefix, int L, int R) {
        if (L == 0)
            return prefix.get(R);
        return prefix.get(R) - prefix.get(L - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10)); // example array
        int L = 1, R = 3;
        
        ArrayList<Integer> prefix = createPrefixSum(arr);
        int sum = rangeSum(prefix, L, R);
        
        System.out.println("Sum from index " + L + " to " + R + " is: " + sum);
    }
}