package Q139;

import java.util.HashSet;
import java.util.List;

public class Q139_sol {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty() || s.length() == 0) return false;
        HashSet<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++){
            for (int j = 0; j <= s.length(); j++){
                if (dp[j] && dict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
