/*Find the longest common prefix among a list of strings. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

import java.util.ArrayList;
import java.util.Arrays;

public class ques9 {
    
    public static String longestCommonPrefix(ArrayList<String> strs) {
        if (strs.isEmpty()) return "";

        for (int i = 0; i < strs.get(0).length(); ++i) {
            char c = strs.get(0).charAt(i);
            for (int j = 1; j < strs.size(); ++j) {
                // If i >= current string's length OR mismatch occurs
                if (i >= strs.get(j).length() || strs.get(j).charAt(i) != c) {
                    return strs.get(0).substring(0, i);
                }
            }
        }

        return strs.get(0); // All characters matched
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("flower", "flow", "flight"));
        String result = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }
}