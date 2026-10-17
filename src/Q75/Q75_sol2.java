package Q75;

public class Q75_sol2 {
    public void sortColors(int[] nums) {
        int left = 0, cur = 0, right = nums.length - 1, dummy;
        while (cur <= right){
            if (nums[cur] == 0){
                dummy = nums[left];
                nums[left] = nums[cur];
                nums[cur] = dummy;
                left++;
                cur++;
            }
            else if (nums[cur] == 2){
                dummy = nums[right];
                nums[right] = nums[cur];
                nums[cur] = dummy;
                right--;
            }
            else
                cur++;
        }
    }
}
