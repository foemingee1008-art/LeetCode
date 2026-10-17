package Q136;

public class Q136_sol {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum ^= nums[i];
        }
        return sum;
    }
}
