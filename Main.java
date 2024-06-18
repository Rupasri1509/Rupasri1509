import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(Brackethatcher("(coder)(byte))"));  // Output: 0
        System.out.println(Brackethatcher("(c(oder)) b(yte)")); // Output: 1
    }

    public static int Brackethatcher(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0; // Unmatched closing bracket
                }
            }
        }

        return stack.isEmpty() ? 1 : 0; // If stack is empty, all brackets matched
    }
}
