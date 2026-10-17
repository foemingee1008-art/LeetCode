package Q45;
import java.util.Arrays;

public class Q45_sol1 {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, nums.length);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++){
                dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
            }
        }
        return dp[nums.length - 1];
    }
}
