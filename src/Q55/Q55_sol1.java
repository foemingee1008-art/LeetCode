package Q55;

public class Q55_sol1 {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i <= maxJump; i++){
            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
