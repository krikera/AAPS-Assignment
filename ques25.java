/* Solve the problem of finding the next greater element for each element in an array. 
Write its algorithm, program. Find its time and space complexities. Explain with 
suitable example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ques25 {
    
    public static ArrayList<Integer> nextGreaterElements(ArrayList<Integer> nums) {
        int n = nums.size();
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }
        
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; --i) {
            while (!st.empty() && st.peek() <= nums.get(i))
                st.pop();

            if (!st.empty())
                result.set(i, st.peek());

            st.push(nums.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 2, 25));
        ArrayList<Integer> res = nextGreaterElements(nums);

        System.out.println("Next Greater Elements:");
        for (int val : res)
            System.out.print(val + " ");
    }
}