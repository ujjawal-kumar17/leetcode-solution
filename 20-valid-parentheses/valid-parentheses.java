class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return false; 
        }
        if (s.length() % 2 != 0) {
            return false;  }

       Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

         Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
    }return stack.empty();
}}
