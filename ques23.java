/* How to find the maximum XOR of two numbers in an array. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques23 {
    
    // Function to find the maximum XOR
    public static int maxXor(ArrayList<Integer> arr) {
        int res = 0;
        int fir = 0, sec = 0;
        // Generate all possible pairs
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if((arr.get(i) ^ arr.get(j)) > res) {
                  res = Math.max(res, arr.get(i) ^ arr.get(j));
                  fir = arr.get(i);
                  sec = arr.get(j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(26, 100, 25, 13, 4, 14));
        System.out.println(maxXor(arr));
    }
}