/* How to find the maximum product subarray. Write its algorithm, program. Find its time 
and space complexities. Explain with suitable example.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ques19 {
    
    public static int maxProduct(ArrayList<Integer> nums) {
        int n = nums.size();
        int maxProd = nums.get(0);
        int minProd = nums.get(0);
        int result = nums.get(0);

        for (int i = 1; i < n; ++i) {
            if (nums.get(i) < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums.get(i), nums.get(i) * maxProd);
            minProd = Math.min(nums.get(i), nums.get(i) * minProd);

            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, -2, 4));
        System.out.println("Maximum product subarray is: " + maxProduct(nums));
    }
}