package Q26;

public class Q26_sol {
    public int removeDuplicates(int[] nums) {
        int slow = 1, fast = 1;
        while (fast < nums.length){
            if (nums[fast] == nums[fast - 1]){
                fast++;
            }
            else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }
}
