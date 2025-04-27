/* Use a deque to find the maximum in every sliding window of size K. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class ques31 {
    
    public static ArrayList<Integer> maxSlidingWindow(ArrayList<Integer> nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            // Remove indices of elements not in this window
            if (!dq.isEmpty() && dq.peekFirst() == i - k)
                dq.pollFirst();

            // Remove indices of smaller elements from back
            while (!dq.isEmpty() && nums.get(dq.peekLast()) < nums.get(i))
                dq.pollLast();

            dq.offerLast(i);

            // Add to result when first window is complete
            if (i >= k - 1)
                result.add(nums.get(dq.peekFirst()));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7));
        int k = 3;

        ArrayList<Integer> maxVals = maxSlidingWindow(nums, k);
        for (int val : maxVals)
            System.out.print(val + " ");
    }
}