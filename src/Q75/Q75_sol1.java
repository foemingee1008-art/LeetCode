package Q75;

public class Q75_sol1 {
    public void sortColors(int[] nums) {
        int[] cur = new int[nums.length];
        int zero = 0, one = 0, i;
        for (i = 0; i < nums.length; i++){
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
        }
        for (i = zero; i < zero + one; i++){
            cur[i] = 1;
        }
        for (i = zero + one; i < nums.length; i++){
            cur[i] = 2;
        }
        for (i = 0; i < nums.length; i++){
            nums[i] = cur[i];
        }
    }
}
