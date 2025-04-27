/* Find the majority element in an array that appears more than n/2 times. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques16 {
    
    public static int majorityElement(ArrayList<Integer> nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count += 1;
            } else {
                count -= 1;
            }        
        }

        return candidate;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 1, 1, 1, 2, 2));
        System.out.println("Majority element is: " + majorityElement(nums));
    }
}