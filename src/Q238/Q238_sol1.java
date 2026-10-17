package Q238;

public class Q238_sol1 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int preCum = 1;
        int sufCum = 1;
        for (int i = 0; i < nums.length; i++){
            pre[i] = preCum;
            preCum *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--){
            suf[i] = sufCum;
            sufCum *= nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            answer[i] = pre[i] * suf[i];
        }
        return answer;
    }
}
