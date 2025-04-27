/*Write a program to check if an integer is a palindrome without converting it to a string. 
Write its algorithm, program. Find its time and space complexities. Explain with 
suitable example. */

public class ques29 {
    
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even-length: x == reversedHalf
        // For odd-length: x == reversedHalf / 10 (middle digit can be ignored)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int num = 1221;
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}