package Q13;

import java.util.HashMap;

public class Q13_sol {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanNum = new HashMap<>();
        romanNum.put('I',1);
        romanNum.put('V',5);
        romanNum.put('X',10);
        romanNum.put('L',50);
        romanNum.put('C',100);
        romanNum.put('D',500);
        romanNum.put('M',1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanNum.get(s.charAt(i));
            if (i + 1 < s.length() && current < romanNum.get(s.charAt(i + 1))) {
                sum -= current;
            }
            else {
                sum += current;
            }
        }
        return sum;
    }
}
