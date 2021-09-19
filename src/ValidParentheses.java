import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        // System.out.println(vp.isValid("()"));
        // System.out.println(vp.isValid("()[]{}"));
        // System.out.println(vp.isValid("(]"));
        // System.out.println(vp.isValid("([)]"));
        // System.out.println(vp.isValid("{[]}"));
        System.out.println(vp.isValid("([}}])"));
    }
    
    public boolean isValid(String s) throws EmptyStackException {
        char[] c = s.toCharArray();
        Stack stack = new Stack<>();
        if( c.length == 1) {
            return false;
        }
        if( c.length % 2 == 1) {
            return false;
        }
        for(char individual : c) {
            System.out.println(stack);
            if ( individual == '{' ) {
                stack.push(individual);
            }
            else if ( individual == '}' ) {
                if ( !stack.isEmpty() ) {
                    if ( !stack.isEmpty()) {
                        char cc = (char) stack.peek();
                        if( cc == '{') {
                            stack.pop();
                        }
                    }
                }
            }
            else if ( individual == '[' ) {
                stack.push(individual);
            }
            else if ( individual == ']' ) {
                if ( !stack.isEmpty() ) {
                    char cc = (char) stack.peek();
                        if( cc == '[') {
                            stack.pop();
                        }
                }
            }
            else if ( individual == '(' ) {
                stack.push(individual);
            }
            else if ( individual == ')' ) {
                if ( !stack.isEmpty() ) {
                    char cc = (char) stack.peek();
                        if( cc == '(') {
                            stack.pop();
                        }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
