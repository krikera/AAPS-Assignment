/*Find the longest palindromic substring in a given string. Write its algorithm, program. 
Find its time and space complexities. Explain with suitable example. */

public class ques8 {
    
    public static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return s.substring(left + 1, right); // substring between the valid bounds
    }
    
    public static String longestPalindromicSubstring(String s) {
        if (s.isEmpty()) return "";
    
        String longest = "";
        
        for (int i = 0; i < s.length(); ++i) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);
    
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }
    
        return longest;
    }
    
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindromicSubstring(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}