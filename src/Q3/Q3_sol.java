package Q3;

public class Q3_sol {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1){
            return s.length();
        }
        int slow = 0, max = 0;
        char[] sArr = s.toCharArray();
        int[] count = new int[128];
        for (int fast = 0; fast < sArr.length; fast++){
            count[sArr[fast]]++;
            while (count[sArr[fast]] > 1){
                count[sArr[slow]]--;
                slow++;
            }
            max = Math.max(max, fast - slow + 1);
        }
        return max;
    }
}
