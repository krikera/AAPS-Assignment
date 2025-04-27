/*Find the length of the longest substring without repeating characters. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example.*/

public class ques6 {
    
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] idx = new int[255];
        
        // Initialize all values to -1
        for (int i = 0; i < 255; i++) {
            idx[i] = -1;
        }
        
        int maxlen = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (idx[c] >= start) {
                start = idx[c] + 1;
            }
            idx[c] = end;
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}