package Q12;

public class Q12_sol {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++){
            if (num < values[i]){
                continue;
            }
            int count = num / values[i];
            for (int j = 0; j < count; j++){
                sb.append(symbols[i]);
            }
            num %= values[i];
            if (num == 0){
                break;
            }
        }
        return sb.toString();
    }
}
