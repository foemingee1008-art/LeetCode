package Q20;

import java.util.HashMap;
import java.util.Stack;

public class Q20_sol {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char brackets = s.charAt(i);
            if (map.containsKey(brackets)){
                char expectedLeft = map.get(brackets);
                if (stack.isEmpty() || stack.pop() != expectedLeft){
                    return false;
                }
            }
            else{
                stack.push(brackets);
            }
        }
        return stack.isEmpty();
    }
}
