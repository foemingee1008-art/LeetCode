package Q27;

public class Q27_sol {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
