/*How to count the number of 1s in the binary representation of numbers from 0 to n. 
Write its algorithm, program. Find its time and space complexities. Explain with 
suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques21 {
    
    public static ArrayList<Integer> countBits(int n) {
        ArrayList<Integer> res = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            res.add(0);
        }
        
        for (int i = 1; i <= n; ++i) {
            res.set(i, res.get(i >> 1) + (i & 1));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> result = countBits(n);
        System.out.print("Count of 1s from 0 to " + n + ": ");
        for (int i = 0; i <= n; ++i) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}