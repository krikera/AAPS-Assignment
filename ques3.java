/*Solve the problem of finding the equilibrium index in an array. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques3 {
    
    public static int findEquilibriumIndex(ArrayList<Integer> arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.size(); ++i) {
            int rightSum = totalSum - leftSum - arr.get(i);

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr.get(i);
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));

        int index = findEquilibriumIndex(arr);

        if (index != -1)
            System.out.println("Equilibrium index is: " + index);
        else
            System.out.println("No equilibrium index found.");
    }
}