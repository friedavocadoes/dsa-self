import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class validParenthesis {

    public static boolean check(String par) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put(')', '(');
        parenthesis.put(']', '[');
        parenthesis.put('}', '{');

        for (char c : par.toCharArray()) {
            if (parenthesis.containsKey(c)) {
                if (!st.empty() && st.peek() == parenthesis.get(c)) {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String par = "()[{}";
        System.out.println(check(par));
    }
}