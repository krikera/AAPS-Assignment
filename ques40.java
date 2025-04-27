/* Solve the problem of finding the element with maximum frequency in an array. Write 
its algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ques40 {
    
    public static int maxFrequencyElement(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int maxElem = nums.get(0);

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > maxFreq) {
                maxFreq = freqMap.get(num);
                maxElem = num;
            }
        }

        return maxElem;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 4, 1, 3, 3, 3));
        int result = maxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + result);
    }
}