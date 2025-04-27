/* Implement two stacks in a single array. Write its algorithm, program. Find its time and 
space complexities. Explain with suitable example. */

public class ques28 {
    
    static class TwoStacks {
        int[] arr;
        int size;
        int top1, top2;

        public TwoStacks(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = n;
        }

        public void push1(int x) {
            if (top1 < top2 - 1) {
                arr[++top1] = x;
            } else {
                System.out.println("Stack Overflow in Stack 1");
            }
        }

        public void push2(int x) {
            if (top1 < top2 - 1) {
                arr[--top2] = x;
            } else {
                System.out.println("Stack Overflow in Stack 2");
            }
        }

        public int pop1() {
            if (top1 >= 0)
                return arr[top1--];
            else {
                System.out.println("Stack Underflow in Stack 1");
                return -1;
            }
        }

        public int pop2() {
            if (top2 < size)
                return arr[top2++];
            else {
                System.out.println("Stack Underflow in Stack 2");
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(5);
        ts.push2(10);
        ts.push1(15);
        ts.push2(20);

        System.out.println("Popped from Stack 1: " + ts.pop1()); // 15
        System.out.println("Popped from Stack 2: " + ts.pop2()); // 20
    }
}