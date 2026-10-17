package Q392;

public class Q392_sol {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int slow = 0, fast = 0;
        while (slow < sArr.length && fast < tArr.length){
            if (tArr[fast] == sArr[slow]){
                slow++;
            }
            fast++;
        }
        return slow == sArr.length;
    }
}
