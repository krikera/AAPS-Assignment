/* Generate all permutations of a given array. Write its algorithm, program. Find its time 
and space complexities. Explain with suitable example.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ques38 {
    
    public static void generatePermutations(ArrayList<Integer> nums, int start, 
                                           ArrayList<ArrayList<Integer>> result) {
        if (start == nums.size()) {
            result.add(new ArrayList<>(nums));
            return;
        }
        
        for (int i = start; i < nums.size(); i++) {
            // Swap elements at positions 'start' and 'i'
            int temp = nums.get(start);
            nums.set(start, nums.get(i));
            nums.set(i, temp);
            
            // Fix element at 'start' and generate permutations for rest
            generatePermutations(nums, start + 1, result);
            
            // Backtrack: restore the original array
            temp = nums.get(start);
            nums.set(start, nums.get(i));
            nums.set(i, temp);
        }
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<ArrayList<Integer>> allPermutations = permute(nums);

        System.out.println("All permutations:");
        for (ArrayList<Integer> permutation : allPermutations) {
            System.out.print("{ ");
            for (int val : permutation)
                System.out.print(val + " ");
            System.out.println("}");
        }
    }
}