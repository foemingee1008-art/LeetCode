package Q11;

public class Q11_sol {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0, curArea;
        while (left < right){
            curArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, curArea);
            if (height[left] > height[right]){
                right--;
            }
            else {
                left++;
            }
        }
        return maxArea;
    }
}
