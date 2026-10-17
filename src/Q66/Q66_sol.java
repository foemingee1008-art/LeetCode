package Q66;

public class Q66_sol {
    public int[] plusOne(int[] digits) {
        int[] updatedDigits = new int[digits.length + 1];
        boolean allNine = true;
        int i = digits.length - 1;
        while (i >= 0){
            if (digits[i] == 9)
                allNine = true;
            else{
                allNine = false;
                break;
            }
            i--;
        }
        if (allNine == true){
            updatedDigits[0] = 1;
            return updatedDigits;
        }
        else{
            for (i = digits.length - 1; i >= 0; i--){
                if (digits[i] == 9)
                    digits[i] = 0;
                else{
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
            return digits;
        }
    }
}
