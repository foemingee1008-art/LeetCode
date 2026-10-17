package Q9;

public class Q9_sol {
    public boolean isPalindrome(int x) {
        boolean palStatus = true;
        int i = 0;
        int length = String.valueOf(Math.abs(x)).length();
        int[] digit = new int [length];
        if (x < 0)
            return false;
        else{
            while (x > 0){
                digit[i] = x % 10;
                x = x / 10;
                i++;
            }
            for (i = 0; i < length; i++){
                if (digit [i] != digit [length - 1 - i]){
                    palStatus = false;
                    break;
                }
            }
            return palStatus;
        }
    }
}
