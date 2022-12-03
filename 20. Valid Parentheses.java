class Solution {
    public boolean isValid(String s) {
        //...error checking;
        if (s == null || s.length() == 0) {
            return false;
        }
        
        //...let's solve it using stack;
        Stack<Character> stack = new Stack<>();
        
        //...push all opening braces; pop only when peek is a closing one;
        for (char c : s.toCharArray()) {
            if (c == ')' && stack.size() > 0 && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.size() > 0 && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.size() > 0 && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        //...if size is zero, all were valid else they werent;
        return stack.isEmpty();
    }
}