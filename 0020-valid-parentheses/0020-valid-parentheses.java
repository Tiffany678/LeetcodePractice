class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                // When it is open brackets, store in the stack
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                // When it is a close bracket, it should be stack.pop() = mapping.get(c), else return false
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        // if the bracket string contains paired brackets, the open brackets should be completly removed.
        return stack.isEmpty();
    }
}