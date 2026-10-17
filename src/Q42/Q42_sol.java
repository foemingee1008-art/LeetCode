package Q42;

public class Q42_sol {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length - 1;
        int sum = 0;
        while (left < right){
            if (height[left] < height[right]){
                if (height[left] >= leftMax){
                    leftMax = height[left];
                } else {
                    sum += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax){
                    rightMax = height[right];
                } else {
                    sum += rightMax - height[right];
                }
                right--;
            }
        }
        return sum;
    }
}
