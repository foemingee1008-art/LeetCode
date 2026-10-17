package Q55;

public class Q55_sol2 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (dp[j] && j + nums[j] >= i){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
}
