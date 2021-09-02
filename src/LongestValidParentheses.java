import java.util.Stack;

class LongestValidParentheses {
    public static void main(String[] args) {
        LongestValidParentheses lvp = new LongestValidParentheses();
        System.out.println(lvp.longestValidParentheses("(()"));
        System.out.println(lvp.longestValidParentheses(")()())"));
    }

    public int longestValidParentheses(String s){
        char[] a = s.toCharArray();
        int len = s.length();
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for(int i = 0 ; i < len ; i++) {
            if(a[i] == '('){
                stack.push(i);
            } else {
                if(!stack.empty()){
                    stack.pop();
                }
                if(!stack.empty()){
                    result = Math.max(result, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }
        return result;
    }
}