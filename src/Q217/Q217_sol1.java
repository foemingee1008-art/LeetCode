package Q217;

import java.util.HashSet;
import java.util.Set;

public class Q217_sol1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums){
            if (!  set.add(num)){
                return true;
            }
        }
        return false;
    }
}
