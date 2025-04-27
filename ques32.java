/* How to find the largest rectangle that can be formed in a histogram. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ques32 {
    
    public static int largestRectangleArea(ArrayList<Integer> heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int n = heights.size();
        
        for (int i = 0; i <= n; i++) {
            int currHeight;
            if (i == n)
                currHeight = 0;
            else
                currHeight = heights.get(i);
            
            while (!s.empty() && currHeight < heights.get(s.peek())) {
                int height = heights.get(s.peek());
                s.pop();
                int width = s.empty() ? i : (i - s.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            
            s.push(i);
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
    }
}