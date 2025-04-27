/*Calculate how much water can be trapped between the bars of a histogram. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ques17 {
    
    public static int trap(ArrayList<Integer> height) {
        int left = 0, right = height.size() - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height.get(left) < height.get(right)) {
                if (height.get(left) >= leftMax)
                    leftMax = height.get(left);
                else
                    waterTrapped += leftMax - height.get(left);
                left++;
            } else {
                if (height.get(right) >= rightMax)
                    rightMax = height.get(right);
                else
                    waterTrapped += rightMax - height.get(right);
                right--;
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1));
        System.out.println("Water trapped: " + trap(height) + " units");
    }
}