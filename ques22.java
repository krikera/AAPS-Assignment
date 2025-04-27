/* How to check if a number is a power of two using bit manipulation. Write its algorithm, 
program. Find its time and space complexities. Explain with suitable example. */

public class ques22 {
    
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        if (isPowerOfTwo(n))
            System.out.println(n + " is a power of two.");
        else
            System.out.println(n + " is NOT a power of two.");
    }
}