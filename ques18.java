/* Find the maximum XOR of two numbers in an array. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ques18 {
    
    // Function to find the maximum XOR
    public static int maxXor(ArrayList<Integer> arr) {
        int res = 0, mask = 0;

        // to store all unique bits
        HashSet<Integer> s = new HashSet<>();

        for (int i = 30; i >= 0; i--) {

            // set the i-th bit in mask
            mask |= (1 << i);

            for (int value : arr) {
                // keep prefix of all elements till the i-th bit
                s.add(value & mask);
            }

            int cur = res | (1 << i);

            for (int prefix : s) {
                if (s.contains(cur ^ prefix)) {
                    res = cur;
                    break;
                }
            }
            s.clear();
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(26, 100, 25, 13, 4, 14));
        System.out.println(maxXor(arr));
    }
}