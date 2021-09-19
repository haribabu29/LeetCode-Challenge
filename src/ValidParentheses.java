import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()"));
        System.out.println(vp.isValid("()[]{}"));
        System.out.println(vp.isValid("(]"));
        System.out.println(vp.isValid("([)]"));
        System.out.println(vp.isValid("{[]}"));
        System.out.println(vp.isValid("([}}])"));
    }
    
    public boolean isValid(String s) throws EmptyStackException {
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        Stack<Character> stack = new Stack<Character>();
        char[] cArray = s.toCharArray();
        for ( char c : cArray ) {
            if(map.keySet().contains(c)){
                stack.push(c);
            } else if (map.values().contains(c)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
