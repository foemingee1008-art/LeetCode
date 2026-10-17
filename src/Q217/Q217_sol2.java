package Q217;

import java.util.HashMap;

public class Q217_sol2 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (! map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
