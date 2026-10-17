package Q45;

public class Q45_sol2 {
    public int jump(int[] nums) {
        int maxReach = 0;
        int jumps = 0;
        int curEnd = 0;
        for (int i = 0; i < nums.length - 1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == curEnd){
                curEnd = maxReach;
                jumps++;
            }
        }
        return jumps;
    }
}
