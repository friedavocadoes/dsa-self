import java.util.Stack;
import java.util.*;

public class minStack {
    public static class MinStack {
        Stack<Integer> minStack;

        public MinStack() {
            minStack = new Stack<>();
        }

        public void push(int val) {
            minStack.push(val);
        }

        public void pop() {
            minStack.pop();
        }

        public int top() {
            return minStack.peek();
        }

        public int getMin() {
            Iterator<Integer> it = minStack.iterator();
            int min = minStack.peek();

            while (it.hasNext()) {
                int x = it.next();
                if (min > x) {
                    min = x;
                }
            }
            return min;

        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        System.out.println(minStack.top());
    }

}
