/* Generate all permutations of a given string. Write its algorithm, program. Find its time 
and space complexities. Explain with suitable example. */

public class ques10 {
    
    public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length) {
            System.out.println(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; ++i) {
            swap(chars, index, i);                // Fix the i-th character
            generatePermutations(chars, index + 1); // Recurse
            swap(chars, index, i);                // Backtrack
        }
    }
    
    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All permutations of \"" + s + "\":");
        generatePermutations(s.toCharArray(), 0);
    }
}