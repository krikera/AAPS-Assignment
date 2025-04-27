/* Generate all subsets of a given array. Write its algorithm, program. Find its time and 
space complexities. Explain with suitable example.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ques36 {
    
    public static void generateSubsets(int index, ArrayList<Integer> nums, 
                                      ArrayList<Integer> current, 
                                      ArrayList<ArrayList<Integer>> result) {
        if (index == nums.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude current element
        generateSubsets(index + 1, nums, current, result);

        // Include current element
        current.add(nums.get(index));
        generateSubsets(index + 1, nums, current, result);

        // Backtrack
        current.remove(current.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsets(0, nums, current, result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<ArrayList<Integer>> allSubsets = subsets(nums);

        System.out.println("All subsets:");
        for (ArrayList<Integer> subset : allSubsets) {
            System.out.print("{ ");
            for (int val : subset)
                System.out.print(val + " ");
            System.out.println("}");
        }
    }
}