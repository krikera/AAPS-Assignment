/* Find all unique combinations of numbers that sum to a target. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ques37 {
    
    public static void backtrack(ArrayList<Integer> candidates, int target, 
                                ArrayList<Integer> combination,
                                ArrayList<ArrayList<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.size(); ++i) {
            if (candidates.get(i) > target) break; // Prune the search

            combination.add(candidates.get(i));
            backtrack(candidates, target - candidates.get(i), combination, result, i); // i not i+1, reuse allowed
            combination.remove(combination.size() - 1); // backtrack
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> candidates, int target) {
        Collections.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> combination = new ArrayList<>();
        backtrack(candidates, target, combination, result, 0);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> candidates = new ArrayList<>(Arrays.asList(2, 3, 6, 7));
        int target = 7;

        ArrayList<ArrayList<Integer>> result = combinationSum(candidates, target);

        System.out.println("Unique combinations that sum to " + target + ":");
        for (ArrayList<Integer> comb : result) {
            System.out.print("{ ");
            for (int num : comb) System.out.print(num + " ");
            System.out.println("}");
        }
    }
}