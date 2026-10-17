package Q17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_sol {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        HashMap<Character, String> digit_to_letter = new HashMap<>();
        digit_to_letter.put('2', "abc");
        digit_to_letter.put('3', "def");
        digit_to_letter.put('4', "ghi");
        digit_to_letter.put('5', "jkl");
        digit_to_letter.put('6', "mno");
        digit_to_letter.put('7', "pqrs");
        digit_to_letter.put('8', "tuv");
        digit_to_letter.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder(), res, digit_to_letter);
        return res;
    }
    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digit_to_letter){
        if (idx == digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters = digit_to_letter.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()){
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digit_to_letter);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
